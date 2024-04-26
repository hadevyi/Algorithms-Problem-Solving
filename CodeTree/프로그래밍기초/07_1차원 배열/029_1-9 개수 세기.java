import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1-9 개수 세기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/count-one-to-nine/description
 * 2. 풀이핵심
 *  - count 배열
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, C = 9;
    public static int[] ARR, COUNT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        ARR = new int[N];
        COUNT = new int[C];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        for (int n = 0;n < N;n++)
            COUNT[ARR[n] - 1]++;
        
        StringBuffer sb = new StringBuffer();
        for (int c = 0;c < C;c++)
            sb.append(COUNT[c]).append("\n");
        System.out.println(sb.toString());
    }
}