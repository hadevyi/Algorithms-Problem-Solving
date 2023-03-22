import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 올바른 괄호
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12909
 *  2. 풀이핵심
 *  - 조건을 많이 쓰는게 중요한것이 아닌 최대한 효율적으로 짜는 것이 중요
 * 3. 풀이후기
 *  - pop하는 경우만 두고, 모두 push 하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("()()")); // true
        System.out.println(solution("(())()")); // true
        System.out.println(solution(")()(")); // false
        System.out.println(solution("(()(")); // false
    }

    public static boolean solution(String s) {
        int N = s.length();
        Stack<Character> characterStack = new Stack<>();

        for (int n = 0;n < N;n++) {
            char now_char = s.charAt(n);

            if (!characterStack.isEmpty() && characterStack.peek() == '(' && now_char == ')') characterStack.pop();
            else characterStack.push(now_char);
        }

        return characterStack.size() == 0;
    }
}
