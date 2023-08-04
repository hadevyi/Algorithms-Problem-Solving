import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4751. 다솔이의 다이아몬드 장식
 *  2. 풀이핵심
 *  - 방향 델타
 * 3. 풀이후기
 *  - 델타 8개의 방향 기록해서 하기
 */
public class Solution {
    public static int T, N = 5, M, D = 8;
    public static char[][] MAP;
    public static int[][] DELTA = {{-2, 0}, {-1, -1}, {-1, 1}, {0, -2}, {0, 2}, {1, -1}, {1, 1}, {2, 0}};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            String str = br.readLine();
            M = str.length() + ((str.length() -1) * 3) + 4;
            MAP = new char[N][M];
            for (int n = 0;n < N;n++)
                Arrays.fill(MAP[n], '.');

            Queue<int[]> queue = new LinkedList<>();
            int m = 2;
            for (int idx = 0;idx < str.length();idx++) {
                MAP[2][m] = str.charAt(idx);
                queue.offer(new int[] {2, m});
                m += 4;
            }

            while (!queue.isEmpty()) {
                int[] nowPoint = queue.poll();

                for (int d = 0;d < D;d++) {
                    int ni = nowPoint[0] + DELTA[d][0];
                    int nj = nowPoint[1] + DELTA[d][1];

                    MAP[ni][nj] = '#';
                }
            }

            for (int i = 0;i < N;i++) {
                for (int j = 0; j < M; j++)
                    sb.append(MAP[i][j]);
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
