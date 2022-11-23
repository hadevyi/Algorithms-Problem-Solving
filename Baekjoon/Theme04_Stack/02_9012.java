import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 괄호
 *  - 번호 : 9012
 *  - 링크 : https://www.acmicpc.net/problem/9012
 *  2. 풀이핵심
 *  - stack의 특성을 확인해 push, pop, peek 활용하기
 * 3. 풀이후기
 *  - peek으로 할 내용이 없으면 Exception을 처리한다는 것을 잊어 오류를 냈다.
 *  - 조건을 추가하고, 짝이 맞아 뽑는 것이 아니라면 stack에 저장하여 결과를 냈다.
 */
public class Main {

    static int T;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        Stack<Character> stack;

        T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++) {
            stack = new Stack<>();
            char[] strList = br.readLine().toCharArray();
            int Len = strList.length;

            for (int len = 0;len < Len;len++) {
                char ch = strList[len];

                if (ch == '(') stack.push(ch);
                else {
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                    } else {
                        stack.push(ch);
                    }
                }
            }

            sb.append(stack.isEmpty() ? "YES" : "NO");
            if (t < T - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
