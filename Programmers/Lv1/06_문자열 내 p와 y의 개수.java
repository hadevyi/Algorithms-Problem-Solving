/**
 * 1. 문제정보
 *  - 제목 : 문자열 내 p와 y의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12916
 *  2. 풀이핵심
 *  - 각 구성을 확인해 카운트하기
 * 3. 풀이후기
 *  - 대소문자 구별없이 카운트 해야하는 조건이 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("pPoooyY")); // true
        System.out.println(solution("Pyy")); // false
    }

    public static boolean solution(String s) {
        int countP = 0, countY = 0;
        int N = s.length();

        for (int n = 0;n < N;n++)
            if (s.charAt(n) == 'p' || s.charAt(n) == 'P') countP++;
            else if (s.charAt(n) == 'y' || s.charAt(n) == 'Y') countY++;

        return countP == countY;
    }
}
