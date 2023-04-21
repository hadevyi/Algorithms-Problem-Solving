/**
 * 1. 문제정보
 *  - 제목 : 특별한 이차원 배열 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181833
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0;i < n;i++)
            answer[i][i] = 1;
        return answer;
    }
}