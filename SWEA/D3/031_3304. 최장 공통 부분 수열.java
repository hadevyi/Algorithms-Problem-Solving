import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3304. 최장 공통 부분 수열
 *  2. 풀이핵심
 *  - LCS를 구현하는 방법에 대해서 확인할 수 있었다.
 * 3. 풀이후기
 *  - 관련된 문제를 조금 더 풀어서 잘 기억할 수 있도록 해야겠다.
 */
public class Solution {
    public static int T;
    public static int[][] LCS;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            char[] chList1 = st.nextToken().toCharArray();
            char[] chList2 = st.nextToken().toCharArray();
            int N = chList1.length + 1, M = chList2.length + 1;
            LCS = new int[N][M];

            for (int n = 1;n < N;n++)
                for (int m = 1;m < M;m++)
                    if (chList1[n - 1] == chList2[m - 1]) {
                        LCS[n][m] = LCS[n - 1][m - 1] + 1;
                    } else {
                        LCS[n][m] = Math.max(LCS[n - 1][m], LCS[n][m - 1]);
                    }

            sb.append(LCS[N - 1][M - 1]);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
