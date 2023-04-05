import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 괄호 회전하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/76502
 *  2. 풀이핵심
 *  - Deque와 Stack을 활용한 괄호 확인
 * 3. 풀이후기
 *  - 확인하는 method를 따로 구현해서 진행하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("[](){}")); // 3
        System.out.println(solution("}]()[{")); // 2
        System.out.println(solution("[)(]")); // 0
        System.out.println(solution("}}}")); // 0
    }

    public static int solution(String s) {
        Deque<Character> deque = new LinkedList<>();
        int N = s.length();
        for (Character ch : s.toCharArray())
            deque.addLast(ch);

        int answer = 0;
        for (int n = 0;n < N;n++) {
            StringBuffer sb = new StringBuffer();
            for (int m = 0;m < N;m++) {
                char ch = deque.pollFirst();
                sb.append(ch);
                deque.addLast(ch);
            }

            if (isParenthesis(sb.toString(), N))
                answer++;
            deque.addLast(deque.pollFirst());
        }
        return answer;
    }

    public static boolean isParenthesis(String s, int N) {
        Stack<Character> stack = new Stack<>();
        for (int n = 0;n < N;n++) {
            if (stack.isEmpty()) stack.add(s.charAt(n));
            else if (stack.peek() == '(' && s.charAt(n) == ')') stack.pop();
            else if (stack.peek() == '[' && s.charAt(n) == ']') stack.pop();
            else if (stack.peek() == '{' && s.charAt(n) == '}') stack.pop();
            else stack.push(s.charAt(n));
        }
        return stack.isEmpty();
    }
}
