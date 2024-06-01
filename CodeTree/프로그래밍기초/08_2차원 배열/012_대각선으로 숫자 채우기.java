import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 대각선으로 숫자 채우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/diagonal-numbering/description
 * 2. 풀이핵심
 *  - 2차원 배열과 패턴
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

        int n = 0, m = 0, num = 0;
        while (true) {
            int i = n, j = m;

            while (i >= 0 && j >= 0 && i < N && j < M) {
                ARR[i][j] = ++num;
                i++;j--;
            }

            if (n == N - 1 && m == M - 1) break;
            if (m < M - 1) m++;
            else n++;
        }

        StringBuffer sb = new StringBuffer();
        for (n = 0;n < N;n++) {
            for (m = 0;m < M;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}