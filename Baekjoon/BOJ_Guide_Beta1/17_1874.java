import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 스택 수열
 *  - 번호 : 1874
 *  - 링크 : https://www.acmicpc.net/problem/1874
 *  2. 풀이핵심
 *  - 주어진 수열을 만들 수 있을 것인가 확인하는 과정
 * 3. 풀이후기
 *  - 해당 로직의 특성을 확인하면 쉬웠음.
 */
public class Main {

    public static int N;
    public static int[] arr;
    public static Stack<Integer> stack;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        stack = new Stack<>();

        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(br.readLine());

        int idx = 0;
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            if (arr[idx] > n) {
                stack.push(n);
                sb.append("+").append("\n");
            } else if (arr[idx++] == n)
                sb.append("+").append("\n").append("-").append("\n");

            while (!stack.isEmpty() && arr[idx] == stack.peek()) {
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }
        }

        while (!stack.isEmpty() && arr[idx] == stack.peek()) {
            stack.pop();
            sb.append("-").append("\n");
            idx++;
        }

        System.out.println(stack.isEmpty() ? sb.deleteCharAt(sb.length() - 1) : "NO");
    }
}
