import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열의 평균
 *  - 링크 : https://www.codetree.ai/missions/4/problems/ave-of-array/description
 * 2. 풀이핵심
 *  - 2차원 배열 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 2, M = 4;
    public static int[][] ARR = new int[N][M];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                ARR[n][m] = Integer.parseInt(st.nextToken());
        }

        double total = 0;
        double[] row = new double[N];
        double[] column = new double[M];
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++) {
                int num = ARR[n][m];
                row[n] += num;
                column[m] += num;
                total += num;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            sb.append(String.format("%.1f", row[n] / M)).append(" ");
        sb.append("\n");
        for (int m = 0;m < M;m++)
            sb.append(String.format("%.1f", column[m] / N)).append(" ");
        sb.append("\n").append(String.format("%.1f", total / (N * M)));
        System.out.println(sb.toString());
    }
}