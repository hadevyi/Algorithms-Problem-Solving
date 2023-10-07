import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2805. 농작물 수확하기
 *  2. 풀이핵심
 *  - 반복문 범위
 * 3. 풀이후기
 *  - 간단한 구현 문제
 */
public class Solution {
    public static int T, N;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];

            for (int n = 0;n < N;n++) {
                String str = br.readLine();
                for (int m = 0;m < N;m++)
                    MAP[n][m] = str.charAt(m) - '0';
            }

            int result = 0, startI = N / 2, endI = N / 2, add = 1;

            for (int j = 0;j < N;j++) {

                for (int i = startI;i <= endI;i++) 
                    result += MAP[i][j];

                if (startI == 0 && endI == N - 1) add = -1;

                startI -= add;
                endI += add;
            }

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}