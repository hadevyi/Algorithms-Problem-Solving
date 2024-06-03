import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열로 사각형 만들기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-array-in-rectangle/description
 * 2. 풀이핵심
 *  - 순서대로 채우기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 5;
    public static int[][] ARR = new int[N][N];
    public static void main(String[] args) throws Exception {
        for (int n = 0;n < N;n++)
            for (int m = 0;m < N;m++)
                ARR[n][m] = (n == 0 || m == 0) ? 1 : ARR[n - 1][m] + ARR[n][m - 1];

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}