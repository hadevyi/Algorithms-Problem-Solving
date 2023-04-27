import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 큰 수 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42883
 *  2. 풀이핵심
 *  - Stack을 활용해서 peek과 현재의 값을 비교하기
 * 3. 풀이후기
 *  - 숫자 범위가 넓어 어떻게 제거하는 기준을 세울 것인지 확인
 */
class Solution {
    public String solution(String number, int k) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0;i < number.length();i++) {
            int now = number.charAt(i) - '0';
            while (k > 0 && !stack.isEmpty() && stack.peek() < now) {
                stack.pop();
                k--;
            }
            stack.push(now);
        }

        while (k > 0) {
            k--;
            stack.pop();
        }

        StringBuffer sb = new StringBuffer();
        while (!stack.isEmpty())
            sb.append(stack.pop());
        return sb.reverse().toString();
    }
}