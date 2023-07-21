import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8658. Summation 
 *  2. 풀이핵심
 *  - 문자의 최대값, 최소값
 * 3. 풀이후기
 *  - 가장 편리한 방법으로 할 수 있었음
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = st.countTokens();

            for (int n = 0;n < N;n++) {
                int sum = 0;
                String strNum = st.nextToken();

                for (char ch : strNum.toCharArray())
                    sum += ch - '0';

                max = Math.max(sum, max);
                min = Math.min(sum, min);
            }

            sb.append(max).append(" ").append(min);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
