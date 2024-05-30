import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 개의 격자 비교하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/compare-two-grid/description
 * 2. 풀이핵심
 *  - 새로운 2차원 배열의 선언
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, M;
    public static int[][] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ARR = new int[N][M];

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                ARR[n][m] = Integer.parseInt(st.nextToken());
        }

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                ARR[n][m] = ARR[n][m] == Integer.parseInt(st.nextToken()) ? 0 : 1;
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}