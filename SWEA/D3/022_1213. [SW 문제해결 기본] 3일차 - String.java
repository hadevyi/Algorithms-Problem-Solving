import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1213. [S/W 문제해결 기본] 3일차 - String
 *  2. 풀이핵심
 *  - indexOf를 활용하기
 * 3. 풀이후기
 *  - while로 정리하기
 */
public class Solution {
    public static int T = 10;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            int testCase = Integer.parseInt(br.readLine());
            sb.append("#").append(testCase).append(" ");

            String findStr = br.readLine();
            String originStr = br.readLine();
            int count = 0, idx = 0;

            while (originStr.indexOf(findStr) != -1) {
                originStr = originStr.substring(originStr.indexOf(findStr) + findStr.length());
                count++;
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
