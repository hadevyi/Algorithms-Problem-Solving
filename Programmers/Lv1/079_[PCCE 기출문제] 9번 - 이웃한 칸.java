/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 9번 / 이웃한 칸
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250125
 * 2. 풀이핵심
 * - 간단한 4방 탐색
 * 3. 풀이후기
 * - 쉬운 문제 풀이
 */
class Solution {
    public int D = 4;
    public int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int solution(String[][] board, int h, int w) {
        int answer = 0, N = board.length;
        String check = board[h][w];
        
        for (int d = 0;d < D;d++) {
            int nh = h + DELTA[d][0];
            int nw = w + DELTA[d][1];
            
            if (nh < 0 || nw < 0 || nh >= N || nw >= N) continue;
            
            if (board[nh][nw].equals(check)) answer++;
        }
        
        return answer;
    }
}