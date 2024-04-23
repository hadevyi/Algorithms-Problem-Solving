import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 조건에 맞게 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-in-specific-conditions/description
 * 2. 풀이핵심
 *  - 배열 만들기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.countTokens();
        ARR = new int[N];

        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        for (int n = 0;n < N;n++) {
            int num = ARR[n];
            if (num == 0) continue;
            if (num % 2 == 0) ARR[n] = num / 2;
            else ARR[n] = num + 3;
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            if (ARR[n] == 0) break;
            sb.append(ARR[n]).append(" ");
        }

        System.out.println(sb.toString());
    }
}