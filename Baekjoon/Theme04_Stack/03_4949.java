import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 균형잡힌 세상
 *  - 번호 : 4949
 *  - 링크 : https://www.acmicpc.net/problem/4949
 *  2. 풀이핵심
 *  - 괄호문제의 확장 구현 문제
 *  - 짝을 확인해 스택을 활용하기
 * 3. 풀이후기
 *  - 출력 결과가 YES/NO가 아닌 yes/no임을 확인안해서 틀렸다...
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack;
        StringTokenizer st;

        while(true) {
            String str = br.readLine();

            if (str.equals(".")) break;

            stack = new Stack<>();
            int Len = str.length();

            for (int len = 0;len < Len;len++) {
                char ch = str.charAt(len);

                // 왼쪽 괄호는 무조건 push
                if (ch == '(' || ch == '[') stack.push(ch);

                // 오른쪽 괄호는 확인하기
                if (ch == ')')
                    if (!stack.isEmpty() && stack.peek() == '(') stack.pop();
                    else stack.push(ch);
                else if (ch == ']')
                    if (!stack.isEmpty() && stack.peek() == '[') stack.pop();
                    else stack.push(ch);
            }

            sb.append(stack.isEmpty() ? "yes" : "no").append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
