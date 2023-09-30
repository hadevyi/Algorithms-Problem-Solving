import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1984. 중간 평균값 구하기
 *  2. 풀이핵심
 *  - 간단한 인덱스 조정
 * 3. 풀이후기
 *  - 쉬운 문제 풀이
 */
public class Solution {

    public static int T, N = 10;
    public static int[] NUM;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            NUM = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                NUM[n] = Integer.parseInt(st.nextToken());

            Arrays.sort(NUM);

            double total = 0;

            for (int idx = 1;idx < N - 1;idx++)
                total += NUM[idx];

            sb.append(Math.round(total / (N - 2)));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}