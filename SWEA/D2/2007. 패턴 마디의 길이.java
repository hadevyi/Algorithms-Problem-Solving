import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2007. 패턴 마디의 길이
 *  2. 풀이핵심
 *  - 문자열 편집
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
            int ANS = 0;
            String str = br.readLine();

            for (int idx = 1;idx < str.length() - 1;idx++) {
                if (findCount(str.substring(0, idx).toCharArray(), str.substring(idx).toCharArray())) {
                    ANS = str.substring(0, idx).length();
                    break;
                }
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean findCount(char[] basic, char[] check) {
        int MAX = basic.length > check.length ? check.length : basic.length;
        boolean isCorrect = true;

        for (int idx = 0;idx < MAX;idx++) {
            if (basic[idx] != check[idx]) {
                isCorrect = false;
                break;
            }
        }

        return isCorrect;
    }
}
