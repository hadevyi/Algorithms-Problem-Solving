import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 택배상자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131704
 *  2. 풀이핵심
 *  - queue와 stack의 특징을 진행하기
 * 3. 풀이후기
 *  - 컨테이너 벨트의 특징을 보고 진행하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {4, 3, 1, 2, 5})); // 2
        System.out.println(solution(new int[] {5, 4, 3, 2, 1})); // 5
    }

    public static int solution(int[] order) {
        int N = order.length, answer = 0, index = 0;
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for (int i = 1;i <= N;i++) queue.offer(i);

        while (true) {
            if ((queue.isEmpty() && stack.isEmpty()) ||
                    queue.isEmpty() && !stack.isEmpty() && stack.peek() != order[index])
                break;

            if (!queue.isEmpty() && queue.peek() == order[index]) {
                queue.poll();
                index++;
                answer++;
            } else if (!queue.isEmpty() && queue.peek() != order[index]) {
                stack.push(queue.poll());
            }

            if (!stack.isEmpty() && stack.peek() == order[index]) {
                stack.pop();
                index++;
                answer++;
            }
        }

        return answer;
    }
}
