import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : n개의 숫자 중 최대 2개
 *  - 링크 : https://www.codetree.ai/missions/4/problems/two-max-of-n-num/description
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

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(ARR);
        System.out.printf("%d %d", ARR[N - 1], ARR[N - 2]);
    }
}