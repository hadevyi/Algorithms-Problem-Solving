import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1215. [S/W 문제해결 기본] 3일차 - 회문1
 *  2. 풀이핵심
 *  - 방향 확인
 * 3. 풀이후기
 *  - 델타를 썼고, 상하/좌우 각 하나씩만 선택하면 되었다.
 */
public class Solution {

    public static int T = 10, N = 8, FIND, COUNT;
    public static char[][] MAP;
    public static String[] ARR;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            FIND = Integer.parseInt(br.readLine());
            MAP = new char[N][N];
            ARR = new String[FIND];
            COUNT = 0;

            for (int i = 0;i < N;i++) {
                String row = br.readLine();
                for (int j = 0;j < N;j++)
                    MAP[i][j] = row.charAt(j);
            }

            for (int i = 0;i < N;i++)
                for (int j = 0;j < N;j++)
                    COUNT += findPalindrome(i, j);

            sb.append(COUNT);
            if (t < 10) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int D = 2;
    public static int[][] DELTA = {{0, 1}, {1, 0}};
    public static int findPalindrome(int i, int j) {
        int count = 0;

        for (int d = 0;d < D;d++) {
            int ni = i + DELTA[d][0] * (FIND - 1);
            int nj = j + DELTA[d][1] * (FIND - 1);
            if (ni < 0 || ni >= N || nj < 0 || nj >= N) continue;
            //System.out.println("to(" + i + ", " + j + ")\tfrom(" + ni + ", " + nj + ")");
            count = isPalindrome(i, j, ni, nj) ? count + 1 : count;
        }

        return count;
    }

    public static boolean isPalindrome(int startI, int startJ, int endI, int endJ) {
        if (startI == endI) {
            // j 증가
            int i = startI;
            for (int d = 0;d < FIND / 2;d++) {
                if (MAP[i][startJ + d] != MAP[i][endJ - d])
                    return false;
            }
        } else {
            // i 증가
            int j = startJ;
            for (int d = 0;d < FIND / 2;d++) {
                if (MAP[startI + d][j] != MAP[endI - d][j])
                    return false;
            }
        }
        return true;
    }
}
