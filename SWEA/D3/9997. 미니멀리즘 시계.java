import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 9997. 미니멀리즘 시계
 *  2. 풀이핵심
 *  - 몫과 나머지
 * 3. 풀이후기
 *  - 간단한 풀이였다.
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int angle = Integer.parseInt(br.readLine());

            sb.append(angle / (360 / 12)).append(" ").append(angle % (360 / 12) * 2);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
