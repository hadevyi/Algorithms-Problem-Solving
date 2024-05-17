import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 자동차 단일 거래 이익 최대화하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/max-profit-of-single-car/description
 * 2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        int max = 0;
        for (int n = 0;n < N;n++) {
            for (int m = n + 1;m < N;m++) {
                if (ARR[m] - ARR[n] <= 0) continue;
                max = Math.max(max, ARR[m] - ARR[n]);
            }
        }

        System.out.println(max);
    }
}