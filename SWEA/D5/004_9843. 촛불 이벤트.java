import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 9843. 촛불 이벤트
 *  2. 풀이핵심
 *  - 제곱근을 통한 수식
 * 3. 풀이후기
 *  - 분류랑 상관없이 다양하게 출력해보다가 풀린 문제라 얻어걸린 느낌이다. 큰 수의 풀이는 제곱근이 좋은 방법 중 하나이다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            long N = Long.parseLong(br.readLine());
            // k (k + 1) / 2 = n
            // k (k + 1) = 2n
            long step = (long) Math.sqrt(N * 2);
            long result = (step * (step + 1)) / 2;

            sb.append(N == result ? step : -1);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
