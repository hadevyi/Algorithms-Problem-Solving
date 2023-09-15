import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1974. 스도쿠 검증
 *  2. 풀이핵심
 *  - 함수 분리
 * 3. 풀이후기
 *  - 적절하게 분리해서 구현하였다.
 */
public class Solution {

    public static int T, N = 9;
    public static int[][] MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            MAP = new int[N][N];

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int m = 0;m < N;m++)
                    MAP[n][m] = Integer.parseInt(st.nextToken());
            }

            sb.append(isBlock()&&isRow()&&isCol() ? 1 : 0);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static boolean isBlock() {
        for (int i = 0;i < N;i += 3)
            for (int j = 0;j < N;j += 3)
                if (!blockCheck(i, j))
                    return false;
        return true;
    }

    public static boolean blockCheck(int startI, int startJ) {
        boolean[] isNum = new boolean[N + 1];

        for (int i = startI;i < startI + 3;i++)
            for (int j = startJ;j < startJ + 3;j++) {
                if (isNum[MAP[i][j]]) return false;
                isNum[MAP[i][j]] = true;
            }

        return true;
    }

    public static boolean isRow() {
        for (int i = 0;i < N;i++) {
            boolean[] isNum = new boolean[N + 1];
            for (int j = 0;j < N;j++) {
                if (isNum[MAP[i][j]]) return false;
                isNum[MAP[i][j]] = true;
            }
        }
        return true;
    }

    public static boolean isCol() {
        for (int j = 0;j < N;j++) {
            boolean[] isNum = new boolean[N + 1];
            for (int i = 0;i < N;i++) {
                if (isNum[MAP[i][j]]) return false;
                isNum[MAP[i][j]] = true;
            }
        }
        return true;
    }
}