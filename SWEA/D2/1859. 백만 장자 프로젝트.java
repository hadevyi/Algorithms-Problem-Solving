import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1859. 백만 장자 프로젝트
 *  2. 풀이핵심
 *  - 역으로 계산하기
 * 3. 풀이후기
 *  - long 범위체크를 하지 않아서 fail이 났다.
 */
public class Solution {

    public static int T, N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());
            ARR = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                ARR[n] = Integer.parseInt(st.nextToken());

            int NUM = ARR[N - 1];
            long RESULT = 0;
            for (int idx = N - 2;idx >= 0;idx--) {
                if (NUM > ARR[idx]) {
                    RESULT += NUM - ARR[idx];
                } else {
                    NUM = ARR[idx];
                }
            }

            sb.append(RESULT);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}