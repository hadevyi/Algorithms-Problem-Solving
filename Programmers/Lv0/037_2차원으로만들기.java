/**
 * 1. 문제정보
 *  - 제목 : 2차원으로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120842
 *  2. 풀이핵심
 *  - 각 행과 열을 먼저 계산해야함
 * 3. 풀이후기
 *  - 문제 풀이보다는 결과를 출력해서 확인하기 힘들었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(print2DArray(solution(new int[] {1, 2, 3, 4, 5, 6, 7, 8}, 2))); // [[1, 2], [3, 4], [5, 6], [7, 8]]
        System.out.println(print2DArray(solution(new int[] {100, 95, 2, 4, 5, 6, 18, 33, 948}, 3))); // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }

    private static String print2DArray(int[][] array) {
        int N = array.length;
        int M = array[0].length;
        StringBuffer sb = new StringBuffer();
        sb.append("[");
        for (int i = 0;i < N;i++) {
            sb.append("[");
            for (int j = 0; j < M; j++) {
                sb.append(array[i][j]);
                if (j < M - 1) sb.append(", ");
            }
            sb.append("]");
            if (i < N - 1) sb.append(", ");
        }
        sb.append("]");
        return sb.toString();
    }

    public static int[][] solution(int[] num_list, int n) {
        int N = num_list.length / n, M = n, idx = 0;
        int[][] answer = new int[N][M];

        for (int i = 0;i < N;i++)
            for (int j = 0;j < M;j++)
                answer[i][j] = num_list[idx++];

        return answer;
    }
}
