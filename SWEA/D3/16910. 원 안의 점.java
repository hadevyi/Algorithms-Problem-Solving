import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 16910. 원 안의 점
 *  2. 풀이핵심
 *  - 원의 반지름 식
 * 3. 풀이후기
 *  - 중복되는 위치와 적절한 위치를 확인하는 과정이 조금 더 필요했다.
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

            int result = 0;
            for (int n = 1;n < N;n++)
                result += (int)(Math.sqrt(N * N - n * n));
            result *= 4;
            result += N * 4;
            sb.append(++result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}