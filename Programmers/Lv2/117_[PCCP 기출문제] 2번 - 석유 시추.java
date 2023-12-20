import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 * - 제목 : [PCCP 기출문제] 2번 / 석유 시추
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250136
 * 2. 풀이핵심
 * - 간다한 BFS
 * 3. 풀이후기
 * - 함수로 분리하지 않고하니 오히려 더 헷갈렸다
 */
class Solution {
    public int D = 4, N, M;
    public int[][] DELTA = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
    public int solution(int[][] land) {
        N = land.length;
        M = land[0].length;
        int[] TOTAL = new int[M];
        boolean[][] isVisited = new boolean[N][M];
        
        for (int i = 0;i < N;i++) {
            for (int j = 0;j < M;j++) {
                if (land[i][j] == 0) continue;
                if (isVisited[i][j]) continue;
                
                Set<Integer> set = new HashSet<>();
                Queue<int[]> queue = new LinkedList<>();
                isVisited[i][j] = true;
                queue.offer(new int[] {i, j});
                set.add(j);
                int total = 0;
                
                while (!queue.isEmpty()) {
                    int[] data = queue.poll();
                    total++;
                    
                    for (int d = 0;d < D;d++) {
                        int ni = data[0] + DELTA[d][0];
                        int nj = data[1] + DELTA[d][1];
                        
                        if (ni < 0 || nj < 0 || ni >= N || nj >= M) continue;
                        if (isVisited[ni][nj]) continue;
                        if (land[ni][nj] == 0) continue;
                        
                        isVisited[ni][nj] = true;
                        queue.offer(new int[] {ni, nj});
                        set.add(nj);
                    }
                }
                
                for (int idx : set)
                    TOTAL[idx] += total;
            }
        }
        
        System.out.println(Arrays.toString(TOTAL));
        int answer = TOTAL[0], maxIdx = 0;
        for (int i = 1;i < M;i++) {
            if (answer < TOTAL[i]) {
                maxIdx = i;
                answer = TOTAL[i];
            }
        }
        
        return answer;
    }
}