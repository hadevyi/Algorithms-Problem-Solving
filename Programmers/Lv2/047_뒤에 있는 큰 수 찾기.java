import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 뒤에 있는 큰 수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/154539
 *  2. 풀이핵심
 *  - Stack을 활용하기
 * 3. 풀이후기
 *  - Stack에 주로 value를 넣어서 진행했는데, 이번 접근은 index로 진행해야 하는 관점이 어려웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(Arrays.toString(solution(new int[] {2, 3, 3, 5}))); // [3, 5, 5, -1]
        System.out.println(Arrays.toString(solution(new int[] {9, 1, 5, 3, 6, 2}))); // [-1, 5, 6, 6, -1, -1]
    }

    public static int[] solution(int[] numbers) {
        Stack<Integer> stack = new Stack<>();
        int[] answer = new int[numbers.length];
        stack.push(0);

        for (int n = 1;n < numbers.length;n++) {
            while (!stack.isEmpty() && numbers[stack.peek()] < numbers[n])
                answer[stack.pop()] = numbers[n];
            stack.push(n);
        }

        while(!stack.isEmpty()) {
            answer[stack.pop()] = -1;
        }

        return answer;
    }
}
