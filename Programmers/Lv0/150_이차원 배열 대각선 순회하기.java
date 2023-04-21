/**
 * 1. 문제정보
 *  - 제목 : 이차원 배열 대각선 순회하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181829
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[][] board, int k) {
        int N = board.length, M = board[0].length;
        int answer = 0;
        for (int i = 0;i < N;i++)
            for (int j = 0;j < M;j++)
                if (i + j <= k)
                    answer += board[i][j];
        return answer;
    }
}