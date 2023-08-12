import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2930. 힙
 *  2. 풀이핵심
 *  - PriorityQueue 연습하기
 * 3. 풀이후기
 *  - 최대 힙과 최소 힙의 기준은 Collections의 기준이 중요하다.
 */
public class Solution {

    public static int T, N;
    public static PriorityQueue<Integer> pq;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            pq = new PriorityQueue<>(Collections.reverseOrder());
            N = Integer.parseInt(br.readLine());

            for (int n = 0;n < N;n++) {
                StringTokenizer st = new StringTokenizer(br.readLine());

                int command = Integer.parseInt(st.nextToken());

                if (command == 1) {
                    int num = Integer.parseInt(st.nextToken());
                    pq.offer(num);
                } else {
                    if (pq.isEmpty()) sb.append(-1);
                    else sb.append(pq.poll());
                    sb.append(" ");
                }
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
