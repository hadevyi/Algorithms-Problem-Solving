/**
 * 1. 문제정보
 *  - 제목 : 최소직사각형
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/86491
 *  2. 풀이핵심
 *  - 적절하게 회전시켜야 함
 * 3. 풀이후기
 *  - 각 긴방향과 짧을 방향을 통일시켜야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[][] {{60, 50}, {30, 70}, {60, 30}, {80, 40}})); // 4000
        System.out.println(solution(new int[][] {{10, 7}, {12, 3}, {8, 15}, {14, 7}, {5, 15}})); // 120
        System.out.println(solution(new int[][] {{14, 4}, {19, 6}, {6, 16}, {18, 7}, {7, 11}})); // 133
    }

    public static int solution(int[][] sizes) {
        for (int i = 0;i < sizes.length;i++)
            if (sizes[i][0] > sizes[i][1])
                remoteWidthHeight(i, sizes);
        return getMaxLenth(0, sizes) * getMaxLenth(1, sizes);
    }

    public static void remoteWidthHeight(int idx, int[][] sizes) {
        int temp = sizes[idx][0];
        sizes[idx][0] = sizes[idx][1];
        sizes[idx][1] = temp;
    }

    public static int getMaxLenth(int idx, int[][] sizes) {
        int MAX = Integer.MIN_VALUE;

        for (int[] size : sizes)
            MAX = Math.max(size[idx], MAX);

        return MAX;
    }
}
