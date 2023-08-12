import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3000. 중간값 구하기
 *  2. 풀이핵심
 *  - bigger와 smaller라는 PriorityQueue를 활용하는 것이다.
 * 3. 풀이후기
 *  - 다양한 방법을 활용했는데, bigger의 top에 중간값을 넣었기에 조절할 수 있는 단계를 확인하는 것이 중요했다.
 */
public class Solution {

    public static long RESULT;
    public static int T, N, MOD = 20171109;
    public static PriorityQueue<Integer> bigger, smaller;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            RESULT = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            bigger = new PriorityQueue<>();
            smaller = new PriorityQueue<>(Collections.reverseOrder());
            bigger.offer(Integer.parseInt(st.nextToken()));

            for (int n = 0;n < N;n++) {
                st = new StringTokenizer(br.readLine());
                int num1 = Integer.parseInt(st.nextToken());
                int num2 = Integer.parseInt(st.nextToken());

                insertNum(num1);
                insertNum(num2);

                if (bigger.size() > smaller.size()) {
                    while (bigger.size() != smaller.size() + 1) {
                        int num = bigger.poll();
                        smaller.offer(num);
                    }
                } else if (bigger.size() < smaller.size()) {
                    while (bigger.size() != smaller.size() + 1) {
                        int num = smaller.poll();
                        bigger.offer(num);
                    }
                }

                RESULT += bigger.peek();
            }

            sb.append(RESULT % MOD);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static void insertNum(int num) {
        if (bigger.peek() <= num) bigger.offer(num);
        else smaller.offer(num);
    }
}
