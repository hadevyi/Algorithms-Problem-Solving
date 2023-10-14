import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 14178. 1차원 정원
 *  2. 풀이핵심
 *  - 특징 확인 후 일반식 만들기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken()) * 2 + 1;

            int result = N / D;

            if (N % D != 0) result ++;

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}