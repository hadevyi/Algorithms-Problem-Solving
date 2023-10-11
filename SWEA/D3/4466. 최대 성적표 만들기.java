import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 4466. 최대 성적표 만들기
 *  2. 풀이핵심
 *  - 정렬 및 반복 횟수 제한
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
            int K = Integer.parseInt(st.nextToken());

            PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
            st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                pq.offer(Integer.parseInt(st.nextToken()));

            int result = 0;
            for (int k = 0;k < K;k++)
                result += pq.poll();

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}