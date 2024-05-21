import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 스택
 *  - 번호 : 10828
 *  - 링크 : https://www.acmicpc.net/problem/10828
 *  2. 풀이핵심
 *  - 스택 메소드의 특징을 알고 구현하기
 * 3. 풀이후기
 *  - switch case를 활용해 구현하였음
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            switch (st.nextToken()) {
                case "push" : stack.push(Integer.parseInt(st.nextToken())); break;
                case "pop" : if (stack.isEmpty()) sb.append(-1).append("\n"); else sb.append(stack.pop()).append("\n"); break;
                case "size" : sb.append(stack.size()).append("\n"); break;
                case "empty" : if (stack.isEmpty()) sb.append(1).append("\n"); else sb.append(0).append("\n"); break;
                case "top" : if (stack.isEmpty()) sb.append(-1).append("\n"); else sb.append(stack.peek()).append("\n"); break;
            }
        }

        System.out.println(sb.toString());
    }
}
;