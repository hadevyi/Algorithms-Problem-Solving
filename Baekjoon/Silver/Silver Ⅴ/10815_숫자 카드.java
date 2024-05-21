import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자카드
 *  - 번호 : 10815
 *  - 링크 : https://www.acmicpc.net/problem/10815
 *  2. 풀이핵심
 *  - 있는지 없는지를 확인하는 문제기에 자료구조의 contains 메소드를 활용했음
 * 3. 풀이후기
 *  - ArrayList로 진행했을 때는 시간초과가 발생했음
 *  - HashSet으로 자료구조를 바꿔 통과함. 이는 List와 Set의 차이로 추가 학습함
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        HashSet<Long> sangList = new HashSet<>(); // 상근이의 카드
        for (int n = 0;n < N;n++)
            sangList.add(new Long(Long.parseLong(st.nextToken())));

        int M = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        st = new StringTokenizer(br.readLine());

        for (int m = 0;m < M;m++) {
            if (sangList.contains(Long.parseLong(st.nextToken())))
                sb.append(1);
            else
                sb.append(0);
            sb.append(" ");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
