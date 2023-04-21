/**
 * 1. 문제정보
 *  - 제목 : rny_string
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181863
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String rny_string) {
        return rny_string.replaceAll("m", "rn");
    }
}