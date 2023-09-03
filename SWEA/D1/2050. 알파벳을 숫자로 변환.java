import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 2050. 알파벳을 숫자로 변환
 *  2. 풀이핵심
 *  - 아스키코드 값 정리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();

        for (int idx = 0;idx < str.length();idx++) {
            sb.append((str.charAt(idx) - 'A') + 1);
            if (idx < str.length() - 1) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
