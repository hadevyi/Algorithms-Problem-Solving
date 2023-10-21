import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 6692. 다솔이의 월급 상자
 *  2. 풀이핵심
 *  - 연산
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            N = Integer.parseInt(br.readLine());

            double result = 0;
            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                double p = Double.parseDouble(st.nextToken());
                double x = Double.parseDouble(st.nextToken());
                result += p * x;
            }

            sb.append(result);
        }

        System.out.println(sb.toString());
    }
}