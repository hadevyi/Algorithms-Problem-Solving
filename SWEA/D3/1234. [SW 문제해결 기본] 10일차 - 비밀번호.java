import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1234. [S/W 문제해결 기본] 10일차 - 비밀번호
 *  2. 풀이핵심
 *  - Stack
 * 3. 풀이후기
 *  - 간단한 문제풀이
 */
public class Solution {

    public static int T = 10, N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());

            char[] chList = st.nextToken().toCharArray();

            Stack<Integer> stack = new Stack<>();
            for (int i = N - 1;i >= 0;i--) {
                int num = chList[i] - '0';
                if (!stack.isEmpty() && stack.peek() == num) stack.pop();
                else stack.push(num);
            }

            while (!stack.isEmpty())
                sb.append(stack.pop());

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}