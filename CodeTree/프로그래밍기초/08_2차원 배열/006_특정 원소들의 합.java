import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 원소들의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-specific-elements/description
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

        int result = 0;
        for (int n = 0;n < N;n++)
            for (int m = 0;m <= n;m++)
                result += ARR[n][m];
        System.out.println(result);
    }
}