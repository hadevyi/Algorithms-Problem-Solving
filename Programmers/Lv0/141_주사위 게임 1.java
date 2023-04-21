/**
 * 1. 문제정보
 *  - 제목 : 주사위 게임 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181839
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        if (a % 2 == 1 && b % 2 == 1) answer += a * a + b * b;
        else if (a % 2 == 1 || b % 2 == 1) answer += 2 * (a + b);
        else answer += (int)(Math.abs(a - b));
        return answer;
    }
}