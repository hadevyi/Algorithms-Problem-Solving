import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 스택 수열
 *  - 번호 : 1874
 *  - 링크 : https://www.acmicpc.net/problem/1874
 *  2. 풀이핵심
 *  - 입력받는 수열을 만들 수 있을지를 확인하는 과정
 * 3. 풀이후기
 *  - 반례 찾기가 힘들었다. 4 3 1 2 4 반례를 통해서 추가적인 구간을 설계했다.
 *  - 문제 자체를 이해하는 것도 힘들었지만, 반례를 구현하는 과정도 어려웠다.
 */
public class Main {
    static int N; // 최대 숫자
    static int[] arr; // 수열로 확인할 배열

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        arr = new int[N];

        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(br.readLine());

        int idx = 0, num = 1;
        while(idx <= N - 1 && num <= N) {
            if (num < arr[idx]) {
                stack.push(num++);
                sb.append("+").append("\n");
            } else if (num == arr[idx]) {
                stack.push(num++);
                sb.append("+").append("\n");
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            }

            if (!stack.isEmpty() && stack.peek().equals(arr[idx])) {
                stack.pop();
                sb.append("-").append("\n");
                idx++;
            } else if (!stack.isEmpty() && stack.peek().compareTo(arr[idx]) == 1) {
                break;
            }
        }

        while (!stack.isEmpty() && stack.peek().equals(arr[idx])) {
            stack.pop();
            sb.append("-").append("\n");
            idx++;
        }

        System.out.println(stack.isEmpty() ? sb.deleteCharAt(sb.length() - 1) : "NO");
    }
}
