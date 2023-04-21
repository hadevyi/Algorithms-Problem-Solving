/**
 * 1. 문제정보
 *  - 제목 : 특정한 문자를 대문자로 바꾸기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181873
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String my_string, String alp) {
        if (my_string.contains(alp)) {
            my_string = my_string.replace(alp, Character.toString((char)(alp.charAt(0) - ('a' - 'A'))));
        }
        return my_string;
    }
}