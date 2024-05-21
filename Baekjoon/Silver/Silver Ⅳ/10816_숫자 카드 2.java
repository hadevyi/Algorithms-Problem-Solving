import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자 카드 2
 *  - 번호 : 10816
 *  - 링크 : https://www.acmicpc.net/problem/10816
 *  2. 풀이핵심
 *  - 갯수를 찾아서 출력하는 과정
 * 3. 풀이후기
 *  - Class을 구현해 직접 구현 > 시간초과
 *  - Array를 구현해 직접 구현 > 시간초과
 *  - ArrayList를 통해 Collection.frequency() > 시간 초과
 *  - HashMap을 이용해 구현 > 성공
 */
public class Main {

    public static int N, M;
    public static Map<Integer, Integer> hashMap;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        hashMap = new HashMap<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());
            if (hashMap.containsKey(num))
                hashMap.put(num, hashMap.get(num) + 1);
            else
                hashMap.put(num, 1);
        }

        M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int m = 0;m < M;m++) {
            int num = Integer.parseInt(st.nextToken());
            sb.append(hashMap.containsKey(num) ? hashMap.get(num) : 0).append(" ");
        }
        System.out.println(sb.toString());
    }
}
