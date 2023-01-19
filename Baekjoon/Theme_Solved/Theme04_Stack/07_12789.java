import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 도키도키 간식드리미
 *  - 번호 : 12789
 *  - 링크 : https://www.acmicpc.net/problem/12789
 *  2. 풀이핵심
 *  - stack의 특성을 이용해 순차를 확인하기
 * 3. 풀이후기
 *  - 각 확인 단계마다 동일한 절차를 반복하는 로직을 위치시켰음.
 */
public class Main {
    static int N, NOW; // 1 <= N <= 1000

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        NOW = 1;
        N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken());

            if (num == NOW) {
                NOW ++;
            } else if (!stack.isEmpty() && stack.peek() == NOW) {
                NOW++;
                stack.pop();
            } else stack.push(num);

            while (!stack.isEmpty() && stack.peek() == NOW) {
                NOW++;
                stack.pop();
            }
        }

        System.out.println(stack.isEmpty() ? "Nice" : "Sad");
    }
}
