import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 십의 자리 숫자
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-tens-digit/description
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
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = st.countTokens();
        ARR = new int[N];
        COUNT = new int[C];

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());
            if (num == 0) {
                N = n;
                break;
            }
            ARR[n] = num;
        }
        
        for (int n = 0;n < N;n++) {
            int num = ARR[n];
            if (num < 10) continue;
            COUNT[(num / 10) - 1]++;
        }
        
        StringBuffer sb = new StringBuffer();
        for (int c = 0;c < C;c++)
            sb.append(c + 1).append(" - ").append(COUNT[c]).append("\n");
        System.out.println(sb.toString());
    }
}