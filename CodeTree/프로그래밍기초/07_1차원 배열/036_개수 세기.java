import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 개수 세기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/count-numbers/description
 * 2. 풀이핵심
 *  - 탐색
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, M;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        ARR = new int[N];

        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        int count = 0;
        for (int n = 0;n < N;n++) {
            if (ARR[n] != M) continue;
            count++;
        }

        System.out.println(count);
    }
}