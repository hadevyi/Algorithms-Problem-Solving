import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 11446. 사탕 가방
 *  2. 풀이핵심
 *  - Binary Search
 * 3. 풀이후기
 *  - 어느 기준을 이분탐색해야할지 모호해, 손으로 직접 모두 기록해보았던 문제. 재풀이가 필요하다.
 */
public class Solution {

    public static int T, N;
    public static long M;
    public static long[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            settingInput(br);

            long start = 1, end = ARR[N - 1];
            long ANS = 0;

            while (start <= end) {
                long mid = (start + end) / 2;

                long count = 0;
                for (long arr : ARR)
                    count += arr/mid;

                if (count < M) end = mid - 1;
                else {
                    ANS = mid;
                    start = mid + 1;
                }
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void settingInput(BufferedReader br) throws Exception {
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());   // 사탕의 종류
        M = Long.parseLong(st.nextToken());     // 1개 가방에 넣는 M개의 사탕개수
        ARR = new long[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Long.parseLong(st.nextToken());
        Arrays.sort(ARR);
    }
}
