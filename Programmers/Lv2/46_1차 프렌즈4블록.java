/**
 * 1. 문제정보
 *  - 제목 : [1차] 프렌즈4블록
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17679
 *  2. 풀이핵심
 *  - 중력으로 밑으로 당기기
 * 3. 풀이후기
 *  - 중력으로 당기는 것이 어려웠음
 */
public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(solution(4, 5, new String[] {"CCBDE", "AAADE", "AAABF", "CCBBF"})); // 14
        System.out.println(solution(6, 6, new String[] {"TTTANT", "RRFACC", "RRRFCC", "TRRRAA", "TTMMMF", "TMMTTJ"})); // 15
    }

    public static int COUNT;
    public static String[][] MAP;
    public static int solution(int m, int n, String[] board) {
        COUNT = 0;
        MAP = new String[m][n];

        for (int i = 0;i < m;i++)
            for (int j = 0;j < n;j++)
                MAP[i][j] = Character.toString(board[i].charAt(j));

        while (true)
            if (!checkBlock())
                break;

        return COUNT;
    }

    public static int D = 3;
    public static int[][] DELTA = {{0, 1}, {1, 1}, {1, 0}};
    public static boolean checkBlock() {
        boolean result = false;
        int m = MAP.length, n = MAP[0].length;
        boolean[][] isDeleted = new boolean[m][n];

        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                boolean isSame = true;
                String block = MAP[i][j];

                for (int d = 0;d < D;d++) {
                    int ni = i + DELTA[d][0];
                    int nj = j + DELTA[d][1];

                    if (ni < 0 || nj < 0 || ni >= m || nj >= n || MAP[ni][nj].equals("0") || !MAP[ni][nj].equals(block)) {
                        isSame = false;
                        break;
                    }
                }

                if (isSame) {
                    isDeleted[i][j] = true;
                    result = true;
                    for (int d = 0;d < D;d++) {
                        int ni = i + DELTA[d][0];
                        int nj = j + DELTA[d][1];
                        isDeleted[ni][nj] = true;
                    }
                }
            }
        }

        if (!result) return false;

        for (int i = 0;i < m;i++)
            for (int j = 0; j < n; j++)
                if (isDeleted[i][j]) {
                    COUNT++;
                    MAP[i][j] = "0";
                }

        String[][] newMAP = new String[m][n];
        for (int j = 0;j < n;j++) {
            int idx = m - 1;
            for (int i = m - 1;i >= 0;i--) {
                if (isDeleted[i][j]) continue;

                newMAP[idx--][j] = MAP[i][j];
            }
        }

        for (int i = 0;i < m;i++) {
            for (int j = 0;j < n;j++) {
                if (newMAP[i][j] == null)
                    newMAP[i][j] = "0";
            }
        }

        for (int i = 0;i < m;i++)
            MAP[i] = newMAP[i].clone();

        return true;
    }
}
