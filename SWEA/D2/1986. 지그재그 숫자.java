import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1986. 지그재그 숫자
 *  2. 풀이핵심
 *  - 나머지로 홀/짝 구별
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine()), ANS = 0;

            for (int n = 1;n <= N;n++) {
                if (n % 2 == 1) ANS += n;
                else ANS -= n;
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
