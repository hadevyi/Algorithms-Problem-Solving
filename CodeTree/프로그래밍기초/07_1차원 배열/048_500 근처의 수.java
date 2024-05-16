import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 500 근처의 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/near-500/description
 * 2. 풀이핵심
 *  - min/max
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new int[N];
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
        for (int n = 1;n < N;n++) {
            if (ARR[n] < 500) max = Math.max(max, ARR[n]);
            else min = Math.min(min, ARR[n]);
        }

        System.out.printf("%d %d", max, min);
    }
}