/**
 * 1. 문제정보
 *  - 제목 : 가장 큰 정사각형 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12905
 *  2. 풀이핵심
 *  - 완전 탐색으로는 시간초과된다. 각 위치의 최대 길이를 갱신하며, 최대값을 찾는 DP로 진행한다.
 * 3. 풀이후기
 *  - 생각치 못한 방법이였는데, 진행 방법을 보고 나니 이해가 잘 되었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{0,1,1,1},{1,1,1,1},{1,1,1,1},{0,0,1,0}})); // 9
        System.out.println(solution(new int[][] {{0,0,1,1},{1,1,1,1}})); // 4
    }

    public static int solution(int [][]board) {
        if (isAllZero(board)) return 0;
        int answer = 1;

        for (int i = 1;i < board.length;i++)
            for (int j = 1;j < board[0].length;j++) {
                if (board[i][j] == 0) continue;
                board[i][j] = Math.min(Math.min(board[i - 1][j], board[i][j - 1]), board[i - 1][j - 1]) + 1;
                answer = Math.max(answer, board[i][j]);
            }

        return answer * answer;
    }

    public static boolean isAllZero(int[][] board) {
        for (int[] b : board)
            for (int data : b)
                if (data == 1)
                    return false;
        return true;
    }
}
