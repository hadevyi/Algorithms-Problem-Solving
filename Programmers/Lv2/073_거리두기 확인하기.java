import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 거리두기 확인하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/81302
 *  2. 풀이핵심
 *  - BFS의 단순 구현문제
 * 3. 풀이후기
 *  - 깔끔한 구현! 만족스럽다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new String[][] {{"POOOP", "OXXOX", "OPXPX", "OOXOX", "POXXP"}, {"POOPX", "OXPXP", "PXXXO", "OXXXO", "OOOPP"}, {"PXOPX", "OXOXP", "OXPOX", "OXXOP", "PXPOX"}, {"OOOXX", "XOOOX", "OOOXX", "OXOOX", "OOOOO"}, {"PXPXP", "XPXPX", "PXPXP", "XPXPX", "PXPXP"}})); // [1, 0, 1, 1, 1]
    }

    public static int N = 5;
    public static String[][] map;
    public static int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for (int idx = 0;idx < places.length;idx++) {
            boolean isOK = true;
            String[] place = places[idx];
            Queue<Point> queue = new LinkedList<>();
            map = new String[N][N];

            for (int i = 0;i < N;i++)
                for (int j = 0;j < N;j++) {
                    map[i][j] = Character.toString(place[i].charAt(j));
                    if (map[i][j].equals("P"))
                        queue.offer(new Point(i, j));
                }

            while(!queue.isEmpty()) {
                if (!check(queue.poll())) {
                    isOK = false;
                    break;
                }
            }
            answer[idx] = isOK ? 1 : 0;
        }
        return answer;
    }

    public static int D = 4;
    public static int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public static boolean check(Point point) {
        Queue<Point> queue = new LinkedList<>();
        boolean[][] isVisited = new boolean[N][N];
        isVisited[point.i][point.j] = true;
        queue.offer(point);
        int len = 0;

        while(!queue.isEmpty()) {
            int SIZE = queue.size();
            len++;
            if (len > 2) break;

            for (int size = 0;size < SIZE;size++) {
                Point p = queue.poll();

                for (int d = 0;d < D;d++) {
                    int ni = p.i + DELTA[d][0];
                    int nj = p.j + DELTA[d][1];

                    if (ni < 0 || nj < 0 || ni >= N || nj >= N || isVisited[ni][nj]) continue;
                    if (map[ni][nj].equals("X")) continue;
                    if (map[ni][nj].equals("P")) return false;

                    queue.offer(new Point(ni, nj));
                    isVisited[ni][nj] = true;
                }
            }
        }

        return true;
    }

    public static class Point {
        int i, j;
        public Point(int i, int j) {
            this.i = i;
            this.j = j;
        }
    }
}
