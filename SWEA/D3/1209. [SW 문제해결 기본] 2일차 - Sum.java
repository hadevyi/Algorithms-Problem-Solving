import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1209. [S/W 문제해결 기본] 2일차 - Sum
 *  2. 풀이핵심
 *  - 배열 인덱스
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T = 10, N = 100;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            int testCase = Integer.parseInt(br.readLine());
            sb.append("#").append(testCase).append(" ");

            MAP = new int[N][N];
            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int m = 0;m < N;m++) {
                    int num = Integer.parseInt(st.nextToken());
                    MAP[n][m] = num;
                }
            }

            sb.append(Math.max(getMinRow(), getMinCross()));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getMinRow() {
        int result = 0;

        for (int n = 0;n < N;n++) {
            int sum1 = 0, sum2 = 0;
            for (int m = 0;m < N;m++) {
                sum1 += MAP[n][m];
                sum2 += MAP[m][n];
            }
            result = Math.max(result, sum1);
            result = Math.max(result, sum2);
        }

        return result;
    }

    public static int getMinCross() {
        int sum1 = 0, sum2 = 0;

        for (int n = 0, m = N - 1;n < N && m >= 0;n++, m--) {
            sum1 += MAP[n][n];
            sum2 += MAP[n][m];
        }

        return Math.max(sum1, sum2);
    }
}