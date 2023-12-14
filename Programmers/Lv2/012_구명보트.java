import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 구명보트
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42885
 *  2. 풀이핵심
 *  - 가장 적절한 짝을 찾아서 세는 방법
 * 3. 풀이후기
 *  - stack을 이용해서 짝을 세었다. 이 방법이 아니더라도 startIdx와 endIdx를 조절하는 방법도 있다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {70, 50, 80, 50}, 100)); // 3
        System.out.println(solution(new int[] {70, 80, 50}, 100)); // 3
        System.out.println(solution(new int[] {70, 50, 80, 50, 20, 30, 40}, 100)); // 4
    }
    public static int solution(int[] people, int limit) {
        Arrays.sort(people);
        Stack<Integer> stack = new Stack<>();
        int answer = 0;

        for (int i = people.length - 1; i >= 0; i--) {
            if (stack.isEmpty()) stack.push(people[i]);
            else if (stack.peek() + people[i] <= limit) {
                stack.pop();
                answer++;
            } else {
                stack.push(people[i]);
            }
        }

        return answer + stack.size();
    }
}
