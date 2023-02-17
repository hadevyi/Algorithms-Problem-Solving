/**
 * 1. 문제정보
 *  - 제목 : 외계행성의 나이
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120834
 *  2. 풀이핵심
 *  - 소문자의 순서대로 확인하며 진행하는 단계
 * 3. 풀이후기
 *  - ASCII code 값을 활용하기에 간단하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(23)); // cd
        System.out.println(solution(51)); // fb
        System.out.println(solution(100)); // baa
    }

    public static String solution(int age) {
        StringBuffer sb = new StringBuffer();
        String str = Integer.toString(age);
        int Len = str.length();

        for (int len = 0;len < Len;len++)
            sb.append((char)(str.charAt(len) - '0' + 'a'));
        return sb.toString();
    }
}
