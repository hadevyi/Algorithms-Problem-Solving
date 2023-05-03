import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 행렬 테두리 회전하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/77485
 *  2. 풀이핵심
 *  - 단순 구현을 진행함
 * 3. 풀이후기
 *  - lv2에 있는 이유는 단계별로 다 확인해야하는거 말고는 크게 없는거같다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(6, 6, new int[][] {{2,2,5,4},{3,3,6,6},{5,1,6,3}}))); // [8, 10, 25]
        System.out.println(Arrays.toString(solution(3, 3, new int[][] {{1,1,2,2},{1,2,2,3},{2,1,3,2},{2,2,3,3}}))); // [1, 1, 5, 3]
        System.out.println(Arrays.toString(solution(100, 97, new int[][] {{1,1,100,97}}))); // [1]
    }

    public static int[] solution(int rows, int columns, int[][] queries) {
        int num = 1;
        int[][] map = new int[rows + 1][columns + 1];
        for (int r = 1;r <= rows;r++)
            for (int c = 1;c <= columns;c++)
                map[r][c] = num++;

        int[] answer = new int[queries.length];
        for (int idx = 0;idx < queries.length;idx++) {
            int x1 = queries[idx][0], y1 = queries[idx][1], x2 = queries[idx][2], y2 = queries[idx][3];
            int value = map[x1][y1], MIN = map[x1][y1];

            for (int j = y1 + 1;j <= y2;j++) {
                int temp = map[x1][j];
                map[x1][j] = value;
                value = temp;
                MIN = Math.min(MIN, temp);
            }

            for (int i = x1 + 1;i <= x2;i++) {
                int temp = map[i][y2];
                map[i][y2] = value;
                value = temp;
                MIN = Math.min(MIN, temp);
            }

            for (int j = y2 - 1;j >= y1;j--) {
                int temp = map[x2][j];
                map[x2][j] = value;
                value = temp;
                MIN = Math.min(MIN, temp);
            }

            for (int i = x2 - 1;i >= x1;i--) {
                int temp = map[i][y1];
                map[i][y1] =  value;
                value = temp;
                MIN = Math.min(MIN, temp);
            }

            answer[idx] = MIN;
        }
        return answer;
    }
}