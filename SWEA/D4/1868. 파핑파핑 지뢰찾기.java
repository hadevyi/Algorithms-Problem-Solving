import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1868. 파핑파핑 지뢰찾기
 *  2. 풀이핵심
 *  - bfs를 복합적으로 사용하는 문제
 * 3. 풀이후기
 *  - 배열을 많이 사용해서 조금 불안하긴했지만, 어렵지는 않았던 문제
 */
public class Solution {

    public static int T, N, BOMB = 99;
    public static char[][] CHAR_MAP;
    public static int[][] COUNT_MAP;
    public static boolean[][] isVisited;
    public static Queue<int[]> queue;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            CHAR_MAP = new char[N][N];
            COUNT_MAP = new int[N][N];
            isVisited = new boolean[N][N];
            queue = new LinkedList<>();

            // 모양 기록
            for (int n = 0;n < N;n++) {
                String str = br.readLine();
                for (int m = 0;m < N;m++)
                    CHAR_MAP[n][m] = str.charAt(m);
            }

            // 8방 카운팅 확인
            for (int n = 0;n < N;n++)
                for (int m = 0;m < N;m++) {
                    checkNear(n, m);
                    if (COUNT_MAP[n][m] == 0) // 클릭할 수 있는 위치 확인
                        queue.offer(new int[] {n, m});
                    else if  (COUNT_MAP[n][m] == BOMB) // 지뢰는 방문할 수 없음
                        isVisited[n][m] = true;
                }

            int ans = 0;
            // 연속해서 클릭할 수 있는 위치 확인
            while (!queue.isEmpty()) {
                int[] point = queue.poll();

                if (isVisited[point[0]][point[1]]) continue;

                continual(point[0], point[1]);
                ans++;
            }

            for (int n = 0;n < N;n++)
                for (int m = 0;m < N;m++)
                    if (!isVisited[n][m])
                        ans++;

            sb.append(ans);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void continual(int i, int j) {
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[] {i, j});
        isVisited[i][j] = true;

        while (!q.isEmpty()) {
            int[] now = q.poll();

            for (int d = 0;d < D;d++) {
                int ni = now[0] + DELTA[d][0];
                int nj = now[1] + DELTA[d][1];

                if (ni < 0 || nj < 0 || ni >= N || nj >= N) continue; // 범위를 넘어가면 끝
                if (isVisited[ni][nj]) continue;

                if (COUNT_MAP[ni][nj] == 0) {
                    isVisited[ni][nj] = true;
                    q.offer(new int[] {ni, nj});
                } else {
                    isVisited[ni][nj] = true;
                }
            }
        }
    }

    public static int D = 8;
    public static int[][] DELTA = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, -1}, {-1, 1}};
    public static void checkNear(int i, int j) {
        int count = 0;
        if (CHAR_MAP[i][j] == '*') {
            count = BOMB; // 지뢰
        } else {
            for (int d = 0;d < D;d++) {
                int ni = i + DELTA[d][0];
                int nj = j + DELTA[d][1];

                if (ni < 0 || nj < 0 || ni >= N || nj >= N) continue;
                if (CHAR_MAP[ni][nj] == '.') continue;

                count++;
            }
        }
        COUNT_MAP[i][j] = count;
    }
}
