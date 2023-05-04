import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 전력망을 둘로 나누기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86971
 *  2. 풀이핵심
 *  - 제외되는 선을 제외하고 맵을 구성해서 확인한다.
 * 3. 풀이후기
 *  - BFS를 했는데, 어떤식으로 초기에 담을지가 중요한거 같다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(9, new int[][] {{1,3},{2,3},{3,4},{4,5},{4,6},{4,7},{7,8},{7,9}})); // 3
        System.out.println(solution(4, new int[][] {{1,2},{2,3},{3,4}})); // 0
        System.out.println(solution(7, new int[][] {{1,2},{2,7},{3,7},{3,4},{4,5},{6,7}})); // 1
    }

    public static int MIN;
    public static int solution(int n, int[][] wires) {
        MIN = Integer.MAX_VALUE;

        for (int i = 0;i < wires.length;i++) {
            getCheck(n, i, wires);
        }

        return MIN;
    }

    public static void getCheck(int n, int banIdx, int[][] wires) {
        int N = n + 1;
        boolean[] isVisited = new boolean[N];
        int[][] map = new int[N][N];

        for (int i = 0;i < wires.length;i++) {
            if (i == banIdx) continue;
            int x = wires[i][0];
            int y = wires[i][1];
            map[x][y] = map[y][x] = 1;
        }

        int x = banIdx == 0 ? wires[1][0] : wires[0][0];
        Queue<Point> queue = new LinkedList<>();
        for (int i = 1;i <= n;i++) {
            if (map[x][i] == 0) continue;
            Point point = new Point(x, i);
            queue.offer(point);
        }

        while (!queue.isEmpty()) {
            Point p = queue.poll();
            isVisited[p.j] = true;

            for (int i = 1;i <= n;i++) {
                if (map[p.j][i] == 0) continue;
                if (isVisited[i]) continue;
                Point newP = new Point(p.j, i);
                queue.offer(newP);
            }
        }

        int sum1 = 0;
        for (int i = 1;i < N;i++)
            if (isVisited[i]) sum1++;
        int sum2 = n - sum1;
        MIN = Math.min(MIN, Math.abs(sum2 - sum1));
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
