import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 무인도 여행
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/154540
 *  2. 풀이핵심
 *  - bfs의 간단 구현문제
 * 3. 풀이후기
 *  - 간단한 구현문제였다.
 */
class Solution {
    public int N, M;
    public int[][] map;
    public boolean[][] isVisited;
    public ArrayList<Point> arrayList = new ArrayList<>();
    public PriorityQueue<Integer> pq = new PriorityQueue<>();
    public int[] solution(String[] maps) {
        N = maps.length;
        M = maps[0].length();
        map = new int[N][M];
        isVisited = new boolean[N][M];
        
        for (int n = 0;n < N;n++)
            for (int m = 0;m < M;m++) {
                char ch = maps[n].charAt(m);
                map[n][m] = ch == 'X' ? 0 : ch - '0';
                if (ch != 'X') arrayList.add(new Point(n, m));
            }
        
        if (arrayList.isEmpty()) return new int[] {-1};
        
        for (Point point : arrayList) {
            if (isVisited[point.x][point.y]) continue;
            bfs(point);
        }
        
        int idx = 0;
        int[] answer = new int[pq.size()];
        while (!pq.isEmpty())
            answer[idx++] = pq.poll();
        return answer;
    }
    
    public int D = 4;
    public int[][] DELTA = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
    public void bfs(Point p) {
        Queue<Point> queue = new LinkedList<>();
        isVisited[p.x][p.y] = true;
        queue.offer(p);
        int count = map[p.x][p.y];
        
        while (!queue.isEmpty()) {
            Point point = queue.poll();
            
            for (int d = 0;d < D;d++) {
                int nx = point.x + DELTA[d][0];
                int ny = point.y + DELTA[d][1];
                
                if (nx < 0 || nx >= N || ny < 0 || ny >= M || isVisited[nx][ny] || map[nx][ny] == 0) continue;
                
                queue.offer(new Point(nx, ny));
                isVisited[nx][ny] = true;
                count += map[nx][ny];
            }
        }
        
        pq.offer(count);
    }
    
    public class Point {
        int x;
        int y;
        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}