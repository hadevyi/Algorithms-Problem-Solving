import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8500. 극장 좌석
 *  2. 풀이핵심
 *  - 간단한 정렬 문제
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
            StringTokenizer st = new StringTokenizer(br.readLine());
            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

            for (int n = 0;n < N;n++)
                pq.offer(Integer.parseInt(st.nextToken()));

            int result = pq.peek();
            for (int n = 0;n < N;n++)
                result += pq.poll();
            result += N;

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}