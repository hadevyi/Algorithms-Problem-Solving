import java.util.Arrays;

/**
 * 1. 문제정보
 *  - 제목 : 안전지대
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120866
 *  2. 풀이핵심
 *  - 8방 탐색을 기준으로 확인하는 과정을 진행하고 있음.
 * 3. 풀이후기
 *  - 오랜만에 DELTA를 활용해서 진행할 수 있었음.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(
                solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}}));
        // 16
        System.out.println(
                solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 0, 0}, {0, 0, 0, 0, 0}}));
        // 16
        System.out.println(
                solution(new int[][] {{0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 0, 0, 0}, {0, 0, 1, 1, 0}, {0, 0, 0, 0, 0}}));
        // 13
        System.out.println(
                solution(new int[][] {{1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}, {1, 1, 1, 1, 1, 1}}));
        // 0
    }

    public static int N, D = 8;
    public static int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}, {1, 1}, {-1, 1}, {1, -1}, {-1, -1}};
    public static boolean[][] isSelected;
    public static int solution(int[][] board) {
        N = board.length;
        isSelected = new boolean[N][N];

        for (int i = 0;i < N;i++)
            for (int j = 0; j < N; j++)
                if (board[i][j] == 1) {
                    isSelected[i][j] = true;
                    for (int d = 0;d < D;d++) {
                        int ni = i + DELTA[d][0];
                        int nj = j + DELTA[d][1];

                        if (ni < 0 || ni >= N || nj < 0 || nj >= N || isSelected[ni][nj]) continue;

                        isSelected[ni][nj] = true;
                    }
                }

        return getSafeArea();
    }

    public static int getSafeArea() {
        int answer = 0;
        for (int i = 0;i < N;i++)
            for (int j = 0;j < N;j++)
                if (!isSelected[i][j])
                    answer++;
        return answer;
    }
}
