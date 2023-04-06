import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 토스트 계란들
 *  - 출처 : 삼성SW역량테스트 2018 하반기 오전 2번 문제
 *  - 링크 : https://www.codetree.ai/training-field/frequent-problems/toast-eggmold/description?page=1&pageSize=20&username=
 *  2. 풀이핵심
 *  - 2D Array의 깊은 복사가 필수적임
 * 3. 풀이후기
 *  - clone() method는 1D Array에서의 깊은 복사, 2D의 경우 1 depth는 더 들어가야 됨.
 */
public class Main {
    public static int N, L, R, D = 4, COUNT;
    public static int[][] MAP, DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static boolean[][] isVisited;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        L = Integer.parseInt(st.nextToken());
        R = Integer.parseInt(st.nextToken());
        MAP = new int[N][N];

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < N;m++)
                MAP[n][m] = Integer.parseInt(st.nextToken());
        }

        while (true) {
            isVisited = new boolean[N][N];
            int[][] tempMap = copyMAP();
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    if (isVisited[i][j]) continue;
                    bfs(tempMap, i, j);
                }
            }
            if (!isChange(tempMap)) break;
            else {
                MAP = tempMap.clone();
                COUNT++;
            }
        }
        System.out.println(COUNT);
    }

    public static int[][] copyMAP() {
        int[][] temp = new int[N][N];
        for (int i = 0;i < N ;i++)
            for (int j = 0;j < N;j++)
                temp[i][j] = MAP[i][j];
        return temp;
    }

    public static void bfs(int[][] map, int i, int j) {
        ArrayList<Point> arrayList = new ArrayList<>();
        Queue<Point> points = new LinkedList<>();
        points.offer(new Point(i, j));
        isVisited[i][j] = true;
        int total = 0;

        while (!points.isEmpty()) {
            Point now = points.poll();
            total += map[now.i][now.j];
            arrayList.add(now);

            for (int d = 0;d < D;d++) {
                int ni = now.i + DELTA[d][0];
                int nj = now.j + DELTA[d][1];

                if (ni < 0 || nj < 0 || ni >= N || nj >= N || isVisited[ni][nj]) continue;
                int gap = Math.abs(map[now.i][now.j] - map[ni][nj]);
                if (!(L <= gap && gap <= R)) continue;

                points.offer(new Point(ni, nj));
                isVisited[ni][nj] = true;
            }
        }

        total = total / arrayList.size();
        for (Point p : arrayList)
            map[p.i][p.j] = total;
    }

    public static boolean isChange(int[][] map) {
        for (int i = 0;i < N;i++)
            for (int j = 0;j < N;j++)
                if (MAP[i][j] != map[i][j])
                    return true;
        return false;
    }

    public static class Point {
        int i;
        int j;
        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
