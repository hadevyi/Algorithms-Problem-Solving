import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5601. [Professional] 쥬스 나누기
 *  2. 풀이핵심
 *  - 반복문 사용하기
 * 3. 풀이후기
 *  - for문 단순 수행
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int N = Integer.parseInt(br.readLine());

            for (int n = 0;n < N;n++) {
                sb.append(1).append("/").append(N);
                if (n < N - 1) sb.append(" ");
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
