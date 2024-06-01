import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 지그재그로 숫자 채우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/zigzag-numbering/description
 * 2. 풀이핵심
 *  - 2차원 배열과 패턴
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, M;
    public static int[][] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ARR = new int[N][M];

        int num = 0, i = 0, j = 0;
        while (num < N * M) {
            ARR[i][j] = num++;

            if (j % 2 == 0) i++;
            else i--;

            if (i == N) {
                j++;
                i--;
            }

            if (i == -1) {
                j++;
                i++;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}