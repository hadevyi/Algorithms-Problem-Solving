import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3142. 영준이와 신비한 뿔의 숲
 *  2. 풀이핵심
 *  - 일반식 구하기
 * 3. 풀이후기
 *  - 간단한 이항식을 활용한 풀이
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
            int M = Integer.parseInt(st.nextToken());

            /**
             * 유니콘 x, 트윈혼 y
             * x + 2y = N
             * x + y = M
             * */

            int y = N - M;
            int x = M - y;

            sb.append(x).append(" ").append(y);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}