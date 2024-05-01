import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 나눗셈의 나머지
 *  - 링크 : https://www.codetree.ai/missions/4/problems/remainder-of-division/description
 * 2. 풀이핵심
 *  - count 배열
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, DIV, C = 10;
    public static int[] COUNT;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        COUNT = new int[C];
        N = Integer.parseInt(st.nextToken());
        DIV = Integer.parseInt(st.nextToken());

        while (true) {
            COUNT[N % DIV]++;
            N = N / DIV;
            if (N <= 1) break;
        }

        int result = 0;
        for (int c = 0;c < C;c++) {
            int num = COUNT[c];
            if (num == 0) continue;
            result += Math.pow(num, 2);
        }
        
        System.out.println(result);
    }
}