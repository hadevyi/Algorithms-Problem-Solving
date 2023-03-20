import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 바이러스 검사
 *  - 출처 : 삼성SW역량테스트 2015 하반기 1번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/virus-detector/description?page=1&pageSize=20&username=&tier=1%252C5&tags=&statuses=&name=
 *  2. 풀이핵심
 *  - 이미 한 번 검사한 내용에 대해서는 재검사할 필요가 없어서 map으로 찾았음
 * 3. 풀이후기
 *  - 결과의 범위가 int의 범위가 충분히 넘을 수 있어 자료형을 조절해야함
 */
public class Main {

    static int N; // 식당의 수
    static int[] consumerNum; // 식당에 있는 고객 수
    static Map<Integer, Long> resultMap; // 고객 수에 대한 결과 모음
    static int temLeader, temMember; // 검사팀장과 검사팀원이 할 수 있는 최대 고객 수
    // 여기서 팀장은 가게당 오직 한 명이 무조건 필요하며, 팀원은 여러명이 있을 수 있음
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 초기화 및 세팅
        N = Integer.parseInt(br.readLine());
        consumerNum = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            consumerNum[n] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        temLeader = Integer.parseInt(st.nextToken());
        temMember = Integer.parseInt(st.nextToken());
        resultMap = new HashMap<>();

        // 각 식당 단계마다 계산하기
        long result = 0;
        for (int n = 0;n < N;n++) {
            int nowStroeConsumerNumber = consumerNum[n];
            if (resultMap.containsKey(nowStroeConsumerNumber)) {
                // 이미 같은 계산 결과가 있다면, 결과만 가져와서 바로 더하기
                result += resultMap.get(nowStroeConsumerNumber);
                continue;
            }

            long count = 0;
            // 우선 팀장 값 정리하기
            consumerNum[n] -= temLeader;
            count++;

            // 팀장 결과가 0이면 다음 식당 계산하기
            if (consumerNum[n] <= 0) {
                resultMap.put(nowStroeConsumerNumber, count);
                result += count;
                continue;
            }

            // 팀원들 값 정리하기
            count += consumerNum[n] % temMember == 0 ? consumerNum[n] / temMember : consumerNum[n] / temMember + 1;
            resultMap.put(nowStroeConsumerNumber, count);
            result += count;
        }

        System.out.println(result);
    }
}
