import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10개 입력받기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/receive-10-inputs/description
 * 2. 풀이핵심
 *  - 한 줄에 여러 개 입력
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
        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken()); 
            ARR[n] = num;
        }

        int count = 0, sum = 0;
        for (int n = 0;n < N;n++) {
            int num = ARR[n];
            if (num == 0) break;
            sum += num;
            count++;
        }

        System.out.printf("%d %.1f", sum, (double) sum / count);
    }
}