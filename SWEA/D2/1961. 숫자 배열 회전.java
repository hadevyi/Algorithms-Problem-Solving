import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1961. 숫자 배열 회전
 *  2. 풀이핵심
 *  - 간단한 배열 회전
 * 3. 풀이후기
 *  - 문제 읽는것이 오히려 좀 오래걸린 문제
 */
public class Solution {

    public static int T, N;
    public static int[][] MAP;
    public static String[][] RESULT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append("\n");
            N = Integer.parseInt(br.readLine());
            MAP = new int[N][N];
            RESULT = new String[N][3];

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                for (int m = 0; m < N; m++)
                    MAP[n][m] = Integer.parseInt(st.nextToken());
            }

            for (int i = 0;i < 3;i++) {
                rotation();
                memoResult(i);
            }

            for (int n = 0;n < N;n++) {
                for (int m = 0;m < 3;m++)
                    sb.append(RESULT[n][m]).append(" ");
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }

    public static void memoResult(int jIdx) {
        for (int n = 0;n < N;n++) {
            StringBuffer sb = new StringBuffer();
            for (int m = 0;m < N;m++)
                sb.append(MAP[n][m]);
            RESULT[n][jIdx] = sb.toString();
        }
    }

    public static void rotation() {
        int[][] nextMap = new int[N][N];

        for (int originI = 0, newJ = N - 1;originI < N && newJ >= 0;originI++, newJ--) {
            for (int originJ = 0, newI = 0;originJ < N && newI < N;originJ++, newI++) {
                nextMap[newI][newJ] = MAP[originI][originJ];
            }
        }

        for (int n = 0;n < N;n++)
            MAP[n] = nextMap[n].clone();
    }
}
