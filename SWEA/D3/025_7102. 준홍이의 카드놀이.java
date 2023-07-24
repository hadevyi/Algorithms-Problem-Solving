/**
 * 1. 문제정보
 *  - 제목 : 7102. 준홍이의 카드놀이
 *  2. 풀이핵심
 *  - Map을 써보는 문제
 * 3. 풀이후기
 *  - 간단한 풀이
 */
import java.io.*;
import java.util.*;
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            int N = Math.min(num1, num2);
            int M = Math.max(num1, num2);

            Map<Integer, Integer> map = new HashMap<>();
            int maxCount = 0;

            for (int n = 1;n <= N;n++) {
                for (int m = 1;m <= M;m++) {
                    if (map.containsKey(n + m)) {
                        map.put(n + m, map.get(n + m) + 1);
                    } else {
                        map.put(n + m, 1);
                    }

                    maxCount = Math.max(maxCount, map.get(n + m));
                }
            }

            PriorityQueue<Integer> pq = new PriorityQueue<>();
            for (int num : map.keySet())
                if (map.get(num) == maxCount)
                    pq.offer(num);

            while (!pq.isEmpty())
                sb.append(pq.poll()).append(" ");

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}