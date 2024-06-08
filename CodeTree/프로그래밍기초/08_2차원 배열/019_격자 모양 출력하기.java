import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 격자 모양 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-grid-shape/description
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

        for (int m = 0;m < M;m++) {
            st = new StringTokenizer(br.readLine());

            int i = Integer.parseInt(st.nextToken());
            int j = Integer.parseInt(st.nextToken());

            ARR[i - 1][j - 1] = i * j;
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