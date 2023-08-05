import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 10804. 문자열의 거울상
 *  2. 풀이핵심
 *  - 분기처리
 * 3. 풀이후기
 *  - 쉬운 풀이의 문제
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            char[] chList = br.readLine().toCharArray();
            for (int i = chList.length - 1;i >= 0;i--) {
                char ch = chList[i];

                if (ch == 'b') ch = 'd';
                else if (ch == 'd') ch = 'b';
                else if (ch == 'p') ch = 'q';
                else ch = 'p';

                sb.append(ch);
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
