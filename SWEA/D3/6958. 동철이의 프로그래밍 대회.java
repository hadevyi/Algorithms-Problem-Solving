import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 6958. 동철이의 프로그래밍 대회
 *  2. 풀이핵심
 *  - 간단한 조건, 중첩 진행
 * 3. 풀이후기
 *  - 같은 문제가 있음
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int[] arr = new int[N];
            int max = 0;

            for (int n = 0;n < N;n++) {
                st = new StringTokenizer(br.readLine());
                for (int m = 0;m < M;m++)
                    arr[n] += Integer.parseInt(st.nextToken());
                max = Math.max(max, arr[n]);
            }

            int count = 0;
            for (int value : arr)
                if (value == max)
                    count++;

            sb.append(count).append(" ").append(max);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}