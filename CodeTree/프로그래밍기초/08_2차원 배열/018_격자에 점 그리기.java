import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 격자에 점 그리기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/draw-points-on-grid/description
 * 2. 풀이핵심
 *  - 격차로서의 2차원 배열
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
        ARR = new int[N][N];

        int num = 0;
        for (int m = 0;m < M;m++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken()) - 1;
            int j = Integer.parseInt(st.nextToken()) - 1;

            ARR[i][j] = ++num;
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}