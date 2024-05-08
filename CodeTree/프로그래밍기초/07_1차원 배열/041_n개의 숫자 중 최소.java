import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n개의 숫자 중 최소
 *  - 링크 : https://www.codetree.ai/missions/4/problems/min-of-n-num/description
 *  2. 풀이핵심
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

        int min = Integer.MAX_VALUE;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) {
            ARR[n] = Integer.parseInt(st.nextToken());
            min = Math.min(min, ARR[n]);
        }

        int count = 0;
        for (int n = 0;n < N;n++)
            if (ARR[n] == min) count++;
        
        System.out.printf("%d %d", min, count);
    }
}