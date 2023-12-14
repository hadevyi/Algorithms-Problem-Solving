import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 행렬의 덧셈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12950
 *  2. 풀이핵심
 *  - 행과 열의 길이를 구해서 진행하기
 * 3. 풀이후기
 *  - 간단한 구현문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(print2DArray(solution(new int[][] {{1, 2}, {2, 3}}, new int[][] {{3, 4}, {5, 6}}))); // [[4,6],[7,9]]
        System.out.println(print2DArray(solution(new int[][] {{1}, {2}}, new int[][] {{3}, {4}}))); // [[4],[6]]
    }

    public static String print2DArray(int[][] arr) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int[] a : arr)
            sb.append(Arrays.toString(a)).append(",");
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        return sb.toString();
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int N = arr1.length, M = arr1[0].length;
        int[][] answer = new int[N][M];

        for (int n = 0;n < N;n++)
            for (int m = 0;m < M;m++)
                answer[n][m] = arr1[n][m] + arr2[n][m];

        return answer;
    }
}
