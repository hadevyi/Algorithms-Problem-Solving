/**
 * 1. 문제정보
 *  - 제목 : 리코쳇 로봇
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/169199
 *  2. 풀이핵심
 *  - bfs 진행
 * 3. 풀이후기
 *  - bfs를 가져오는 부분과 각 끝까지 이동하는 부분을 분리하였다.
 */
import java.util.*;

class Solution {
    public int N, M;
    public String[][] MAP;
    public int solution(String[] board) {
        int robotX = -1, robotY = -1;
        N = board.length;
        M = board[0].length();
        MAP = new String[N][M];        
        isVisited = new boolean[N][M];
        
        for (int m = 0;m < M;m++)
            for (int n = 0;n < N;n++) {
                MAP[n][m] = Character.toString(board[n].charAt(m));
                
                if (MAP[n][m].equals("R")) {
                    robotX = n;
                    robotY = m;
                }
            }
        
        return bfs(robotX, robotY);
    }
    
    public boolean[][] isVisited;
    public int bfs(int x, int y) {
        Queue<int[]> queue = new LinkedList<>();
        queue.offer(new int[] {x, y});
        isVisited[x][y] = true;
        int count = 0;
        
        while (!queue.isEmpty()) {
            count++;
            int SIZE = queue.size();
            
            for (int size = 0;size < SIZE;size++) {
                int[] now = queue.poll();
                
                for (int d = 0;d < D;d++) {
                    int[] resultPoint = moveToDir(now[0], now[1], d);
                    
                    if (isVisited[resultPoint[0]][resultPoint[1]]) continue;
                    if (MAP[resultPoint[0]][resultPoint[1]].equals("G")) return count;
                    
                    isVisited[resultPoint[0]][resultPoint[1]] = true;
                    queue.offer(new int[] {resultPoint[0], resultPoint[1]});
                }                
            }            
        }
        
        return -1;
    }
    
    public int D = 4;
    public int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}}; // 오왼하상
    public int[] moveToDir(int x, int y, int d) {
        int[] delta = DELTA[d];
        
        while (true) {
            int nx = x + delta[0];
            int ny = y + delta[1];
            
            if (nx < 0 || nx >= N || ny < 0 || ny >= M) break;
            if (MAP[nx][ny].equals("D")) break;
                
            x = nx;
            y = ny;
        }
        
        return new int[] {x, y};
    }
}