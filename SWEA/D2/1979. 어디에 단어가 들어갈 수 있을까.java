import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1979. 어디에 단어가 들어갈 수 있을까
 *  2. 풀이핵심
 *  - 델타를 활용한 풀이
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, N, K;
    public static int[] DELTA;
    public static boolean isVisited[][][];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            inputSetting(br);
            int ANS = 0;

            for (int i = 0;i <= 1;i++) {
                DELTA = i == 0 ? new int[] {0, 1} : new int[] {1, 0};
                for (int n = 0;n < N;n++) {
                    for (int m = 0;m < N;m++) {
                        if (isVisited[n][m][i]) continue;
                        int SIZE = getBlankSize(n, m, i);
                        if (SIZE == K) ANS++;
                    }
                }
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getBlankSize(int n, int m, int i) {
        int count = 0;

        while (true) {
            if (n < 0 || n >= N || m < 0 || m >= N) break;
            if (isVisited[n][m][i]) break;

            count++;
            isVisited[n][m][i] = true;
            n += DELTA[0];
            m += DELTA[1];
        }

        return count;
    }

    public static void inputSetting(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        isVisited = new boolean[N][N][2]; // 0 가로(오른쪽 방향) 확인, 1 세로(아래 방향) 확인

        for (int n = 0;n < N;n++) {
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < N;m++) {
                int num = Integer.parseInt(st.nextToken());
                if (num == 1) continue;
                isVisited[n][m][0] = isVisited[n][m][1] = true;
            }
        }

        DELTA = new int[2];
    }
}
