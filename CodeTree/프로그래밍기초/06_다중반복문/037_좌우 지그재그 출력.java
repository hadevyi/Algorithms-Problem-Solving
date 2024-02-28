import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 좌우 지그재그 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-lr-zigzag/description
 * 2. 풀이핵심
 *  - 행, 열에 따라 다르게 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        int[][] ARR = new int[N][N];
        int num = 1, i = 0, j = 0, step = 1;

        while (num <= N * N) {
            ARR[i][j] = num;

            if ((j == 0 && step == -1) || (j == N - 1 && step == 1)) {
                i++;
                j = i % 2 != 0 ? N : -1;
                step = i % 2 == 0 ? 1 : -1;
            }

            j += step;
            num++;
        }

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}