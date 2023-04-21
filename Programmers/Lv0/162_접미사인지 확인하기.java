/**
 * 1. 문제정보
 *  - 제목 : 접미사인지 확인하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181908
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String my_string, String is_suffix) {
        if (!my_string.contains(is_suffix)) return 0;
        return my_string.lastIndexOf(is_suffix) == (my_string.length() - is_suffix.length()) ? 1 : 0;
    }
}