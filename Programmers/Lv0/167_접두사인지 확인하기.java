/**
 * 1. 문제정보
 *  - 제목 : 접두사인지 확인하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181906
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String my_string, String is_prefix) {
        if (my_string.length() < is_prefix.length()) return 0;
        for (int i = 0;i < is_prefix.length(); i++)
            if (my_string.charAt(i) != is_prefix.charAt(i))
                return 0;
        return 1;
    }
}