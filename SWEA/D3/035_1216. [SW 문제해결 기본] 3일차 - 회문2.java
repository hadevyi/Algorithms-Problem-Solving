import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1216. [S/W 문제해결 기본] 3일차 - 회문2
 *  2. 풀이핵심
 *  - index 값을 조정하는 것이 중요한 문제
 * 3. 풀이후기
 *  - 함수화를 진행해 맵과 역맵의 처리를 진행하였다.
 */
public class Solution {
    public static int T = 10, N = 100, MAX;
    public static char[][] MAP, REVERSE_MAP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            int testCase = Integer.parseInt(br.readLine());
            sb.append("#").append(testCase).append(" ");

            MAX = 0;
            MAP = new char[N][N];
            REVERSE_MAP = new char[N][N];

            for (int n = 0;n < N;n++) {
                String str = br.readLine();

                for (int m = 0;m < N;m++) {
                    char ch = str.charAt(m);
                    MAP[n][m] = REVERSE_MAP[m][n] = ch;
                }
            }

            for (int n = 0;n < N;n++) {
                for (int m = 0;m < N;m++) {
                    for (int length = 1; length <= N;length++) {
                        if (m + length > N) break;
                        checkPalindrome(MAP, n, m, length);
                        checkPalindrome(REVERSE_MAP, n, m, length);
                    }
                }
            }

            sb.append(MAX);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void checkPalindrome(char[][] ARR, int row, int col, int length) {
        boolean result = true;
        for (int startCol = col, endCol = col + length - 1;startCol < col + length / 2;startCol++, endCol--) {
            if (ARR[row][startCol] != ARR[row][endCol]) {
                result = false;
                break;
            }
        }

        if (result) MAX = Math.max(MAX, length);
    }
}
