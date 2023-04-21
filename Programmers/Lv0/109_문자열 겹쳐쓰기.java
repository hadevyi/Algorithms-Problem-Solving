/**
 * 1. 문제정보
 *  - 제목 : 문자열 겹쳐쓰기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181943
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        String before = my_string.substring(0, s);
        String after = my_string.substring(s + overwrite_string.length());
        return before + overwrite_string + after;
    }
}