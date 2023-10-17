import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1208. [S/W 문제해결 기본] 1일차 - Flatten
 *  2. 풀이핵심
 *  - 정렬
 * 3. 풀이후기
 *  - 배열 정렬로 해결하였음
 */
public class Solution {

    public static int T = 10, N = 100;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int TIME = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            ARR = new int[N];
            for (int n = 0;n < N;n++)
                ARR[n] =  Integer.parseInt(st.nextToken());

            for (int time = 0;time < TIME;time++) {
                Arrays.sort(ARR);
                ARR[0]++;
                ARR[N - 1]--;
            }

            Arrays.sort(ARR);
            sb.append(ARR[N - 1] - ARR[0]);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}