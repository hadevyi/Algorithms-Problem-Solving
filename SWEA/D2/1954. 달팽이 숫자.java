import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1954. 달팽이 숫자
 *  2. 풀이핵심
 *  - index 값 조정
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution{

    public static int T, N;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append("\n");
            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];

            int i = 0, j = -1, COUNT = 1, LEN = N;

            while (true) {
                for (int len = 0; len < LEN;len++)
                    MAP[i][++j] = COUNT++;

                LEN--;
                if (LEN == 0) break;

                for (int len = 0;len < LEN;len++)
                    MAP[++i][j] = COUNT++;

                for (int len = 0;len < LEN;len++)
                    MAP[i][--j] = COUNT++;

                LEN--;
                if (LEN == 0) break;

                for (int len = 0;len < LEN;len++)
                    MAP[--i][j] = COUNT++;
            }

            for (int[] map : MAP) {
                for (int data : map)
                    sb.append(data).append(" ");
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}
