import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2005. 파스칼의 삼각형
 *  2. 풀이핵심
 *  - 간단한 분리처리 문제
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, N;
    public static int[][] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append("\n");
            N = Integer.parseInt(br.readLine());
            ARR = new int[N][N];

            for (int i = 0;i < N;i++) {
                for (int j = 0;j <= i;j++) {
                    if (j == 0 || j == i) ARR[i][j] = 1;
                    else ARR[i][j] = ARR[i - 1][j - 1] + ARR[i - 1][j];
                }
            }

            for (int i = 0;i < N;i++) {
                for (int j = 0; j <= i; j++)
                    sb.append(ARR[i][j]).append(" ");
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
