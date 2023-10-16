import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 8931. 제로
 *  2. 풀이핵심
 *  - stack 값 확인하기
 * 3. 풀이후기
 *  - 가장 나중에 들어온 값을 확인해야하기에 stack의 특징을 활용했다.
 */
public class Solution {

    public static int T, K;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            K = Integer.parseInt(br.readLine());

            Stack<Integer> stack = new Stack<>();
            for (int k = 0;k < K;k++) {
                int num = Integer.parseInt(br.readLine());

                if (num == 0) {
                    stack.pop();
                } else {
                    stack.push(num);
                }
            }

            int result = 0;
            while (!stack.isEmpty())
                result += stack.pop();

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}