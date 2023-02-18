/**
 * 1. 문제정보
 *  - 제목 : 대문자와 소문자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120893
 *  2. 풀이핵심
 *  - 대소문자 변환
 * 3. 풀이후기
 *  - ASCII code로 정리하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("cccCCC")); // CCCccc
        System.out.println(solution("abCdEfghIJ")); // ABcDeFGHij
    }

    public static String solution(String my_string) {
        int N = my_string.length();
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            char ch = my_string.charAt(n);

            ch = (char) ('a' <= ch && ch <= 'z' ? 'A' + (ch - 'a') : 'a' + (ch - 'A'));
            sb.append(ch);
        }

        return sb.toString();
    }
}
