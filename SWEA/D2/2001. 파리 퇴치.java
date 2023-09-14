import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2001. 파리 퇴치
 *  2. 풀이핵심
 *  - 간단한 맵 탐색
 * 3. 풀이후기
 *  - 쉽게 할 수 있는 문제였음
 */
public class Solution {

    public static int T, N, M, MAX;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());
            MAX = 0;
            MAP = new int[N][N];

            for (int n = 0;n < N;n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0; m < N; m++)
                    MAP[n][m] = Integer.parseInt(st.nextToken());
            }

            for (int n = 0;n < N - M + 1;n++)
                for (int m = 0;m < N - M + 1;m++)
                    MAX = Math.max(MAX, getSumArea(n, m));

            sb.append(MAX);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getSumArea(int startI, int startJ) {
        int result = 0;
        for (int i = startI;i < startI + M;i++)
            for (int j = startJ;j < startJ + M;j++)
                result += MAP[i][j];
        return result;
    }
}