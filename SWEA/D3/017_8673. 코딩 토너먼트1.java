import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8673. 코딩 토너먼트1
 *  2. 풀이핵심
 *  - 데이터 중첩하기
 * 3. 풀이후기
 *  - 간단한 진행으로 완료하였음
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
            StringTokenizer st = new StringTokenizer(br.readLine());
            Queue<Integer> queue = new LinkedList<>();

            for (int n = 0; n < (int)(Math.pow(2, N));n++)
                queue.add(Integer.parseInt(st.nextToken()));

            int count = 0;
            while (queue.size() > 1) {
                int num1 = queue.poll();
                int num2 = queue.poll();

                count += Math.max(num1, num2) - Math.min(num1, num2);
                queue.add(Math.max(num1, num2));
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
