import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 카카오프렌즈 컬러링북
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/1829
 *  2. 풀이핵심
 *  - 방문체크와 bfs
 * 3. 풀이후기
 *  - 이전 문제들에 비하면 많이 쉬웠다.
 */
class Solution {
    boolean[][] isVisited;
    public int[] solution(int m, int n, int[][] picture) {
        int areaCount = 0, areaMax = 0;
        isVisited = new boolean[m][n];
        
        for (int i = 0;i < m;i++)
            for (int j = 0;j < n;j++) {
                if (picture[i][j] == 0) continue;
                if (isVisited[i][j]) continue;
                areaCount++;
                int area = findArea(i, j, picture);
                areaMax = Math.max(areaMax, area);
            }
        
        return new int[] { areaCount, areaMax };
    }
    
    public int D = 4;
    public int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int findArea(int x, int y, int[][] picture) {
        int count = 0, num = picture[x][y];
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        isVisited[x][y] = true;
        
        while (!queue.isEmpty()) {
            int[] point = queue.poll();
            count++;
            
            for (int d = 0;d < D;d++) {
                int i = point[0] + DELTA[d][0];
                int j = point[1] + DELTA[d][1];
                
                if (i < 0 || j < 0 || i >= isVisited.length || j >= isVisited[0].length) continue;
                if (picture[i][j] != num) continue;
                if (isVisited[i][j]) continue;
                
                isVisited[i][j] = true;
                queue.offer(new int[] {i, j});
            }
        }
        
        return count;
    }
}