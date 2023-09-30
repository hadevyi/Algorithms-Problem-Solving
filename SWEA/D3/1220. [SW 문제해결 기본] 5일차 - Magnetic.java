import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1220. [S/W 문제해결 기본] 5일차 - Magnetic
 *  2. 풀이핵심
 *  - 상태 처리
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T = 10, N;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int m = 0;m < N;m++)
                    MAP[n][m] = Integer.parseInt(st.nextToken());
                // 0 : 공백, 1 : N극, 2 : S극
            }

            int count = 0;

            for (int m = N - 1;m >= 0;m--) {
                boolean isN = false;
                for (int n = 0;n < N;n++) {
                    if (MAP[n][m] == 0) continue;

                    if (MAP[n][m] == 1) {
                        isN = true;
                    } else {
                        if (isN) count++;
                        isN = false;
                    }
                }
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}