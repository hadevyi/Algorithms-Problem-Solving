import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 13736. 사탕 분배
 *  2. 풀이핵심
 *  - 일반식 구하기 및 모듈러 연산
 * 3. 풀이후기
 *  - 일반식 구하기도 모듈러 연산도 쉬운 것이 없었다. 정리하면서 체크해봐야겠다.
 */
public class Solution {

    public static int T;
    public static long MOD;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            long A = Integer.parseInt(st.nextToken());
            long B = Integer.parseInt(st.nextToken());
            long K = Integer.parseInt(st.nextToken());
            MOD = A + B;

            long result = (power(K) * A) % MOD;
            sb.append(Math.min(result, MOD - result));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static long power(long count) {
        if (count <= 1) return count + 1;

        if (count % 2 == 0) {
            long ret = power(count / 2);
            return (ret * ret) % MOD;
        } else {
            long ret = power((count - 1) / 2);
            return (((ret * ret) % MOD) * 2) % MOD;
        }
    }
}
