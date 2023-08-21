import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1240. [S/W 문제해결 응용] 1일차 - 단순 2진 암호코드
 *  2. 풀이핵심
 *  - indexof, substring의 문자열 조절
 * 3. 풀이후기
 *  - 문제해석이 더 어려웠던 문제였다. 
 */
public class Solution {

    public static int T, N, M;
    public static Map<String, Integer> map = new HashMap<String, Integer>() {{
        put("0001101", 0); put("0011001", 1); put("0010011", 2); put("0111101", 3); put("0100011", 4);
        put("0110001", 5); put("0101111", 6); put("0111011", 7); put("0110111", 8); put("0001011", 9);
    }};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            String code = null;

            for (int n = 0;n < N;n++) {
                String str = br.readLine();
                if (str.contains("1")) code = str;
            }

            code = code.substring(0, code.lastIndexOf("1") + 1);
            code = code.substring(code.length() - 56, code.length());

            int odd = 0, even = 0;
            for (int i = 0;i <= 7;i++) {
                int num = map.get(code.substring(0, 7));
                if (i % 2 == 0) even += num;
                else odd += num;
                code = code.substring(7);
            }

            sb.append(((even * 3 + odd) % 10 == 0) ? even+odd : 0);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
