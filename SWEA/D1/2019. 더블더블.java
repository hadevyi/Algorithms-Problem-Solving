import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 2019. 더블더블
 *  2. 풀이핵심
 *  - 2의 제곱 승
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        for (int n = 0;n <=N;n++) {
            sb.append((int)(Math.pow(2, n)));
            if (n < N) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
