import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 격자 반대로 채우기
 *  - 링크 : https://codetree.ai/missions/4/problems/grid-anti-fill/description
 * 2. 풀이핵심
 *  - 2차원 배열과 패턴
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[][] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new int[N][N];

        int n = N - 1, m = N - 1, upCase = m % 2, num = 0;
        while (n >= 0 && m >= 0) {
            ARR[n][m] = ++num;

            if (m % 2 == upCase) n--;
            else n++;

            if (n < 0) {
                n++;
                m--;
            }
            if (n == N) {
                n--;
                m--;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (n = 0;n < N;n++) {
            for (m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}