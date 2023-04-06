/**
 * 1. 문제정보
 *  - 제목 : 행렬의 곱셈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12949
 *  2. 풀이핵심
 *  - 바뀌는 내용을 확인해서 진행하기
 * 3. 풀이후기
 *  - arr1(N x K) x arr2(K x M) = answer(N x M)이 된다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        print2D(solution(new int[][] {{1, 4}, {3, 2}, {4, 1}}, new int[][] {{3, 3}, {3, 3}})); // [[15, 15], [15, 15], [15, 15]]
        print2D(solution(new int[][] {{2, 3, 2}, {4, 2, 4}, {3, 1, 4}}, new int[][] {{5, 4, 3}, {2, 4, 1}, {3, 1, 1}})); // [[22, 22, 11], [36, 28, 18], [29, 20, 14]]
    }

    public static void print2D(int[][] array) {
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int[] arr : array) {
            sb.append("[");
            for (int data : arr)
                sb.append(data).append(",");
            sb.deleteCharAt(sb.length() - 1);
            sb.append("]").append(",");
        }
        sb.deleteCharAt(sb.length() - 1);
        sb.append("]");
        System.out.println(sb.toString());
    }

    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int N = arr1.length, M = arr2[0].length, K = arr1[0].length;
        int[][] answer = new int[N][M];

        for (int n = 0;n < N;n++)
            for (int m = 0;m < M;m++)
                for (int k = 0;k < K;k++)
                    answer[n][m] += arr1[n][k] * arr2[k][m];

        return answer;
    }
}
