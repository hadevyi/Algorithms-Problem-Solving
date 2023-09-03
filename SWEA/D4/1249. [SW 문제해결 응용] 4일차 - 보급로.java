import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1249. [S/W 문제해결 응용] 4일차 - 보급로
 *  2. 풀이핵심
 *  - 경로가 중복만 되지 않고 최단 거리가 아닌 최단 값을 가져야하는 것이 중요했음
 * 3. 풀이후기
 *  - bfs를 하는 조건이 queue가 아닌 priorityQueue로 했다는 것에서 생소하였다.
 */
public class Solution {

    public static int T, N, MIN;
    public static int[][] MAP;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];
            isVisited = new boolean[N][N];
            MIN = Integer.MAX_VALUE;

            for (int n = 0;n < N;n++) {
                String str = br.readLine();
                for (int m = 0;m < N;m++)
                    MAP[n][m] = str.charAt(m) - '0';
            }

            bfs();

            sb.append(MIN);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int D = 4;
    public static boolean[][] isVisited;
    public static int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static void bfs() {
        PriorityQueue<Point> pq = new PriorityQueue<>();
        pq.offer(new Point(0, 0, MAP[0][0]));
        isVisited[0][0] = true;

        while (!pq.isEmpty()) {
            Point point = pq.poll();
            if (point.i == N - 1 && point.j == N - 1)
                MIN = Math.min(MIN, point.cost);

            for (int d = 0;d < D;d++) {
                int ni = point.i + DELTA[d][0];
                int nj = point.j + DELTA[d][1];

                if (ni < 0 || nj < 0 || ni >= N || nj >= N) continue;
                if (isVisited[ni][nj]) continue;

                pq.offer(new Point(ni, nj, point.cost + MAP[ni][nj]));
                isVisited[ni][nj] = true;
            }
        }
    }

    public static class Point implements Comparable<Point> {
        int i, j, cost;

        public Point(int i, int j, int cost) {
            this.i = i;
            this.j = j;
            this.cost = cost;
        }

        @Override
        public int compareTo(Point o) {
            return this.cost - o.cost;
        }
    }
}