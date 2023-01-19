import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 스택
 *  - 번호 : 10828
 *  - 링크 : https://www.acmicpc.net/problem/10828
 *  2. 풀이핵심
 *  - Stack 관련 개념 확인
 * 3. 풀이후기
 *  - pop과 peek은 상단 값이 없다면, Exception을 반환했다.
 *  - N이 1부터 진행되기 때문에, 1이내의 2~5에 해당하지 않는다면 출력값이 없을 수도 있다. 이걸 감안하지 않아, StringIndexOutOfBounds 발생했다.
 */
public class Main {

    /**
     * 1. push X: 정수 X를 스택에 넣는 연산이다.
     * 2. pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * 3. size: 스택에 들어있는 정수의 개수를 출력한다.
     * 4. empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
     * 5. top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
     * */

    static int N;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Stack<Integer> stack = new Stack<Integer>();
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine());

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            if (st.countTokens() == 2 && st.nextToken().equals("push")) {
                stack.push(Integer.parseInt(st.nextToken()));
                continue;
            }

            switch (st.nextToken()) {
                case "pop": sb.append(stack.empty() ? -1 : stack.pop()).append("\n"); break;
                case "size" : sb.append(stack.size()).append("\n"); break;
                case "empty" : sb.append(stack.empty() ? 1 : 0).append("\n"); break;
                case "top": sb.append(stack.empty() ? -1 : stack.peek()).append("\n"); break;
            }

        }

        System.out.println(sb.toString());
    }
}
