/**
 * 1. 문제정보
 *  - 제목 : 더 크게 합치기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181939
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ba = Integer.parseInt(Integer.toString(b) + Integer.toString(a));
        return ab >= ba ? ab : ba;
    }
}