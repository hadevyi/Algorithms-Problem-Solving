import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10200. 구독자 전쟁
 *  2. 풀이핵심
 *  - 교집합 수식
 * 3. 풀이후기
 *  - 교집합 수식을 알아야하는 것이 힘들었다. MAX값은 찾지 않아도 만들 수 있었지만, MIN 값이 어려웠다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            int MAX = Math.min(A, B);
            int MIN = Math.max(0, A + B - N);

            sb.append(MAX).append(" ").append(MIN);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}