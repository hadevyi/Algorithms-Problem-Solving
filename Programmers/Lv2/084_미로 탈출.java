import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 미로 탈출
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/159993
 *  2. 풀이핵심
 *  - 시작과 목표에 대한 bfs 진행
 * 3. 풀이후기
 *  - 레버를 거쳐서 가는 방법을 찾고자했는데, 이거보다는 각각의 최소거리를 구하는게 좋았다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[] {"SOOOL","XXXXO","OOOOO","OXXXX","OOOOE"})); // 16
        System.out.println(solution(new String[] {"LOOXS","OOOOX","OOOOO","OOOOO","EOOOO"})); // -1
    }

    public static int N, M;
    public static char[][] map;
    public static int solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new char[N][M];
        Point start = new Point(0, 0), end = new Point(0, 0), lever = new Point(0, 0);

        for (int n = 0;n < N;n++)
            for (int m = 0; m < M;m++) {
                map[n][m] = maps[n].charAt(m);
                if (map[n][m] == 'S') start = new Point(n, m);
                else if (map[n][m] == 'E') end = new Point(n, m);
                else if (map[n][m] == 'L') lever = new Point(n, m);
            }

        int startToLever = bfs(start, lever);
        int leverToEnd = bfs(lever, end);
        if (startToLever == -1 || leverToEnd == -1) return -1;
        return startToLever + leverToEnd;
    }

    public static int D = 4;
    public static int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public static int bfs(Point start, Point target) {
        boolean[][] isVisited = new boolean[N][M];
        Queue<Point> queue = new LinkedList<>();
        isVisited[start.i][start.j] = true;
        queue.offer(start);
        int turn = 0;

        while (!queue.isEmpty()) {
            int SIZE = queue.size();
            turn++;

            for (int size = 0;size < SIZE;size++) {
                Point now = queue.poll();

                for (int d = 0;d < D;d++) {
                    int ni = now.i + DELTA[d][0];
                    int nj = now.j + DELTA[d][1];

                    if (ni < 0 || ni >= N || nj < 0 || nj >= M) continue;
                    if (map[ni][nj] == 'X' || isVisited[ni][nj]) continue;

                    if (ni == target.i && nj == target.j) return turn;

                    queue.offer(new Point(ni, nj));
                    isVisited[ni][nj] = true;
                }
            }
        }

        return -1;
    }

    public static class Point {
        int i, j;
        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
