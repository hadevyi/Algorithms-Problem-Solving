import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-array/description
 * 2. 풀이핵심
 *  - 2차원 배열 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 4;
    public static int[][] ARR = new int[N][N];
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int m = 0;m < N;m++)
                ARR[n][m] = Integer.parseInt(st.nextToken());
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            int sum = 0;
            for (int m = 0;m < N;m++)
                sum += ARR[n][m];
            sb.append(sum).append("\n");
        }

        System.out.println(sb.toString());
    }
}