import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2047. 신문 헤드라인
 *  2. 풀이핵심
 *  - 간단한 문자열 처리
 * 3. 풀이후기
 *  - 쉬운 문제 코드
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();

        for (char ch : str.toCharArray()) {
            if ('a' <= ch && ch <= 'z') sb.append((char)(ch - ('a' - 'A')));
            else sb.append(ch);
        }

        System.out.println(sb.toString());
    }
}
