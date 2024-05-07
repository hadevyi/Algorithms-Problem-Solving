import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 큰 수 고르기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/picking-biggest-number/description
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
        
        int max = Integer.MIN_VALUE;
        for (int n = 0;n < N;n++)
            max = Math.max(max, ARR[n]);
        System.out.println(max);
    }
}