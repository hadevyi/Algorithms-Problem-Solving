/**
 * 1. 문제정보
 *  - 제목 : 문자열 다루기 기본
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12918
 *  2. 풀이핵심
 *  - method의 목적을 꼼꼼히 확인해야함
 * 3. 풀이후기
 *  - true를 반환하는 조건은 다음과 같음
 *  - 길이가 4 혹은 6이고 숫자로만 구성되어야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("a234")); // false
        System.out.println(solution("1234")); // true
    }

    public static boolean solution(String s) {
        for (char ch : s.toCharArray())
            if (!('0' <= ch && ch <= '9'))
                return false;
        return s.length() == 4 || s.length() == 6;
    }
}
