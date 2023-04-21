/**
 * 1. 문제정보
 *  - 제목 : 부분 문자열인지 확인하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181843
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String my_string, String target) {
        return my_string.contains(target) ? 1 : 0;
    }
}