/**
 * 1. 문제정보
 *  - 제목 : n의 배수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181937
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int num, int n) {
        return num % n == 0 ? 1 : 0;
    }
}