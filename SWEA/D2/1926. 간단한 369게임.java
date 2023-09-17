import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1926. 간단한 369게임
 *  2. 풀이핵심
 *  - 문자열 치환
 * 3. 풀이후기
 *  - 조건에 따라 진행한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int NUM = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int num = 1; num <= NUM;num++) {
            String number = Integer.toString(num);
            boolean isCarp = number.contains("3") || number.contains("6") || number.contains("9");

            if (isCarp) {
                for (int i = 0;i <= 9;i++) {
                    String replace = i != 0 && i % 3 == 0 ? "-" : "";
                    number = number.replaceAll(Integer.toString(i), replace);
                }
            }

            sb.append(number).append(" ");
        }

        System.out.println(sb.toString());
    }
}
