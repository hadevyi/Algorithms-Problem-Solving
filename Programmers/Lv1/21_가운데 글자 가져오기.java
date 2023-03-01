/**
 * 1. 문제정보
 *  - 제목 : 가운데 글자 가져오기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12903
 *  2. 풀이핵심
 *  - 짝수와 홀수에 따라 다르게 작성하기
 * 3. 풀이후기
 *  - 삼항연산자로 간단히 구현함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("abcde")); // c
        System.out.println(solution("qwer")); // we
    }

    public static String solution(String s) {
        return s.length() % 2 == 0 ? s.substring(s.length() / 2 - 1, s.length() / 2 + 1) : Character.toString(s.charAt(s.length() / 2));
    }
}
