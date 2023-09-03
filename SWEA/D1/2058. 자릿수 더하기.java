import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 2058. 자릿수 더하기
 *  2. 풀이핵심
 *  - 문자열 정리하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String num = br.readLine();

        int ANS = 0;
        for (char ch : num.toCharArray())
            ANS += ch - '0';

        System.out.println(ANS);
    }
}
