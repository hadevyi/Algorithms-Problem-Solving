import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1225. [S/W 문제해결 기본] 7일차 - 암호생성기
 *  2. 풀이핵심
 *  - Queue
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Solution {

    public static int T = 10, N = 8;
    public static Queue<Integer> queue;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            int testCase = Integer.parseInt(br.readLine());
            sb.append("#").append(testCase).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            queue = new LinkedList<>();
            for (int n = 0;n < N;n++)
                queue.offer(Integer.parseInt(st.nextToken()));

            int down = 1;
            while (true) {
                int num = queue.poll();

                if (num - down <= 0) {
                    queue.offer(0);
                    break;
                }

                queue.offer(num - down);
                down = down + 1 > 5 ? 1 : down + 1;
            }

            while (!queue.isEmpty())
                sb.append(queue.poll()).append(" ");

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}