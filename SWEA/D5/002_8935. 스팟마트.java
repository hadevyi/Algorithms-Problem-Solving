import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8935. 스팟마트
 *  2. 풀이핵심
 *  - 3차원 DP 풀이
 * 3. 풀이후기
 *  - index의 범위 조절이 힘들다면, 양쪽 모두 0으로 하는 방법도 있음을 확인하였다.
 */
public class Solution {

    public static int T, N, M;
    public static int[] nArray;
    public static Integer[] mArray;
    public static int[][][] DP = new int[3001][101][101];
    
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            inputSetting(br);
            sb.append(findValue(0, 0, 0));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int findValue(int n, int m, int skip) {
        if (n > N) return 0;
        if (DP[n][m][skip] != -1) return DP[n][m][skip];

        int result = 0;

        // 1. N을 스킵하는 경우
        if (n < N) result = Math.max(result, findValue(n + 1, m, skip));
        // 2. M을 스킵하는 경우
        if (m + skip < M) result = Math.max(result, findValue(n, m, skip + 1));
        // 3. N을 선택하고 N을 스킵하는 경우
        if (n < N) result = Math.max(result, findValue(n + 2, m, skip) + nArray[n]);
        // 4. N을 선택하고 M을 스킵하는 경우
        if (n < N && m + skip < M) result = Math.max(result, findValue(n + 1, m, skip + 1) + nArray[n]);
        // 5. M을 선택하고 N을 스킵하는 경우
        if (n < N && m + skip < M) result = Math.max(result, findValue(n + 1, m + 1, skip) + mArray[m]);
        // 6. M을 선택하고 M을 스킵하는 경우
        if (m + skip + 1 < M) result = Math.max(result, findValue(n, m + 1, skip + 1) + mArray[m]);

        return DP[n][m][skip] = result;
    }

    public static void inputSetting(BufferedReader br) throws Exception {
        N = Integer.parseInt(br.readLine());
        nArray = new int[N];
        for (int n = 0;n < N;n++)
            nArray[n] = Integer.parseInt(br.readLine());

        M = Integer.parseInt(br.readLine());
        mArray = new Integer[M];
        for (int m = 0;m < M;m++)
            mArray[m] = Integer.parseInt(br.readLine());
        Arrays.sort(mArray, Collections.reverseOrder());

        for (int n = 0;n <= N;n++)
            for (int m = 0;m <= M;m++)
                for (int k = 0;k <= M;k++)
                    DP[n][m][k] = -1;
    }
}
