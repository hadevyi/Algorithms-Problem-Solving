import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 대소문자 바꾸기
 *  - 번호 : 2744
 *  - 링크 : https://www.acmicpc.net/problem/2744
 * 2. 풀이핵심
 *  - ASCII 코드 값을 활용한 내용
 * 3. 풀이후기
 *  - Integer to Char의 형 변환이 헷갈렸다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        char[] charArr = br.readLine().toCharArray();
        int Len = charArr.length;

        for (int i = 0;i < Len;i++) {
            char ch = charArr[i];

            if ('a' <= ch && ch <= 'z') {
                sb.append((char)(ch - ('a'-'A')));
            } else if ('A' <= ch && ch <= 'Z') {
                sb.append((char)(ch + ('a'-'A')));
            }
        }

        System.out.println(sb.toString());
    }
}