import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 괄호
 *  - 번호 : 9012
 *  - 링크 : https://www.acmicpc.net/problem/9012
 *  2. 풀이핵심
 *  - 괄호 짝을 확인하여 구현하는 문제
 * 3. 풀이후기
 *  - 유효한 괄호 문자열인지를 확인하는 메소드를 별도로 구현하여 진행함.
 */
public class Main {

    public static int N;
    public static Stack<Character> stack;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            stack = new Stack<Character>();
            String str = br.readLine();
            sb.append(checkVPS(str.toCharArray(), str.length()) ? "YES" : "NO").append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static boolean checkVPS(char[] charInput, int LEN) {
        for (int len = 0;len < LEN;len++) {
            if (charInput[len] == '(')
                stack.push('(');
            else
                if (!stack.isEmpty() && stack.peek() == '(')
                    stack.pop();
                else return false;
        }
        return stack.isEmpty();
    }
}
