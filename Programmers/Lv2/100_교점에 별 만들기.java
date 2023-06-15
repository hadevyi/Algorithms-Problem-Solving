import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 교점에 별 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/87377
 *  2. 풀이핵심
 *  - 자료형에 대해서 고민하기
 * 3. 풀이후기
 *  - 자료형 선택 및 정수가 아닌 값을 확인하는 과정에서 어려웠음
 */
class Solution {
    public String[] solution(int[][] line) {
        long[] minPoint = { Long.MAX_VALUE, Long.MAX_VALUE }; // min data
        long[] maxPoint = { Long.MIN_VALUE, Long.MIN_VALUE }; // max data
        Queue<long[]> queue = new LinkedList<>();
        
        for (int i = 0;i < line.length;i++) {
            for (int j = i + 1;j < line.length;j++) {
                long[] point = getPoint(line[i], line[j]);
                if (!correctPoint(point)) continue;
                long x = point[1] / point[0];
                long y = point[2] / point[0];
                minPoint[0] = Math.min(minPoint[0], x);
                minPoint[1] = Math.min(minPoint[1], y);
                maxPoint[0] = Math.max(maxPoint[0], x);
                maxPoint[1] = Math.max(maxPoint[1], y);
                queue.offer(new long[] {x, y});
            }
        }
        
        int M = (int)(maxPoint[0] - minPoint[0]) + 1, N = (int)(maxPoint[1] - minPoint[1]) + 1;
        char[][] array = new char[N][M];
        for (char[] arr : array)
            Arrays.fill(arr, '.');
        
        while (!queue.isEmpty()) {
            long[] point = queue.poll();
            array[(int)(point[1] - minPoint[1])][(int)(point[0] - minPoint[0])] = '*';
        }
        
        String[] answer = new String[N];
        for (int n = N - 1;n >= 0;n--) {
            StringBuffer sb = new StringBuffer();
            for (char data : array[n])
                sb.append(data);
            answer[N - n - 1] = sb.toString();
        }
        return answer;
    }
    
    public boolean correctPoint(long[] point) {
        if (point[0] == 0) return false;
        double pointX = (double) point[1] / point[0];
        double pointY = (double) point[2] / point[0];
        if (pointX % 1 != 0 || pointY % 1 != 0) return false;
        return true;
    }
    
    public long[] getPoint(int[] line1, int[] line2) {
        // line1 = [A, B, E] , line2 = [C, D, F]
        long A = line1[0], B = line1[1], E = line1[2];
        long C = line2[0], D = line2[1], F = line2[2];
        long bottom = A * D - B * C;
        long upX = B * F - E * D;
        long upY = E * C - A * F;
        return new long[] { bottom, upX, upY };
    }
}