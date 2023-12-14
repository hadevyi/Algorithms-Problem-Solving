import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [카카오 인턴] 수식 최대화
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/67257
 *  2. 풀이핵심
 *  - Deque을 활용한 풀이
 * 3. 풀이후기
 *  - 첫 시작에 음수가 없다는 조건을 통해 조금은 쉽게 접근할 수 있었다. 만약에 음수가 있었다면 조금 더 어려워졌을듯...
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println("100-200*300-500+20"); // 60420
        System.out.println("50*6-3*2"); // 300
    }

    public static String[] opLists = {"*+-", "*-+", "+*-", "+-*", "-+*", "-*+"};
    public static long solution(String expression) {
        long answer = 0;

        for (String opList : opLists) {
            Deque<String> dq = getDeque(expression);
            Stack<String> stack = new Stack<>();

            for (int idx = 0;idx < 3;idx++) {
                String op = Character.toString(opList.charAt(idx));
                while (!dq.isEmpty()) {
                    String check = dq.pollFirst();

                    if (check.equals(op)) {
                        long long1 = Long.parseLong(stack.pop());
                        long long2 = Long.parseLong(dq.pollFirst());

                        if (op.equals("*")) stack.push(Long.toString(long1 * long2));
                        else if (op.equals("+")) stack.push(Long.toString(long1 + long2));
                        else if (op.equals("-")) stack.push(Long.toString(long1 - long2));
                    } else stack.push(check);
                }

                Deque<String> newDQ = new LinkedList<>();
                while(!stack.isEmpty())
                    newDQ.addFirst(stack.pop());
                dq = newDQ;
            }

            answer = Math.max(Math.abs(Long.parseLong(dq.pollFirst())), answer);
        }

        return answer;
    }

    public static Deque<String> getDeque(String str) {
        StringBuffer sb = new StringBuffer();
        Deque<String> dq = new LinkedList<>();

        for (char ch : str.toCharArray()) {
            if ('0' <= ch && ch <= '9') sb.append(ch);
            else {
                dq.addLast(sb.toString());
                dq.addLast(Character.toString(ch));
                sb = new StringBuffer();
            }
        }
        dq.addLast(sb.toString());
        return dq;
    }
}
