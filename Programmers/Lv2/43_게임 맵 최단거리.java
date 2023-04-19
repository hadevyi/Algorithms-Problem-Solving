import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 게임 맵 최단거리
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1844
 *  2. 풀이핵심
 *  - 간단한 BFS 구현
 * 3. 풀이후기
 *  - 방문체크와 함께 진행하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,1},{0,0,0,0,1}})); // 11
        System.out.println(solution(new int[][] {{1,0,1,1,1},{1,0,1,0,1},{1,0,1,1,1},{1,1,1,0,0},{0,0,0,0,1}})); // -1
    }


    public static int D = 4;
    public static int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};

    public static int solution(int[][] maps) {
        // 초기 위치 (1, 1) : 좌측 상단
        // 0은 벽, 1이 빈자리
        int answer = 0, N = maps.length, M = maps[0].length;
        boolean[][] isVisited = new boolean[N][M];
        Queue<Point> queue = new LinkedList<>();
        queue.offer(new Point(0, 0));
        isVisited[0][0] = true;
        boolean findEnd = false;

        while(!queue.isEmpty()) {
            int SIZE = queue.size();
            answer++;

            for (int size = 0;size < SIZE;size++) {
                Point nowPoint = queue.poll();

                for (int d = 0;d < D;d++) {
                    int nx = nowPoint.x + DELTA[d][0];
                    int ny = nowPoint.y + DELTA[d][1];

                    if (nx < 0 || nx >= N || ny < 0 || ny >= M || isVisited[nx][ny] || maps[nx][ny] == 0) continue;

                    queue.offer(new Point(nx, ny));
                    isVisited[nx][ny] = true;
                    if (nx == N - 1 && ny == M - 1) {
                        return answer + 1;
                    }
                }
            }
        }

        return -1;
    }

    public static class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}
