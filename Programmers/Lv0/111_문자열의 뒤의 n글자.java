/**
 * 1. 문제정보
 *  - 제목 : 문자열의 뒤의 n글자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181910
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String my_string, int n) {
        return my_string.substring(my_string.length() - n);
    }
}