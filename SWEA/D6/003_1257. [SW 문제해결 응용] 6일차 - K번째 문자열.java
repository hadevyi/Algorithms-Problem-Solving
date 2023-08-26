import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1257. [S/W 문제해결 응용] 6일차 - K번째 문자열
 *  2. 풀이핵심
 *  - pq와 set으로 해결
 * 3. 풀이후기
 *  - 문자열 정돈 확인하기
 */
public class Solution {

    public static int T, K;
    public static Set<String> set;
    public static PriorityQueue<String> pq;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            K = Integer.parseInt(br.readLine());
            set = new HashSet<>();
            pq = new PriorityQueue<>();
            String str = br.readLine();

            for (int n = 0;n < str.length();n++)
                for (int m = n + 1; m <= str.length(); m++) {
                    if (set.contains(str.substring(n, m))) continue;
                    set.add(str.substring(n, m));
                    pq.offer(str.substring(n, m));
                }

            if (pq.size() < K) sb.append("none");
            else {
                while (K-- > 1) pq.poll();
                sb.append(pq.poll());
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
