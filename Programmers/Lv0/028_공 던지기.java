import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 공 던지기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120843
 *  2. 풀이핵심
 *  - 앞뒤로 빼고 넣을 수 있는 Deque를 활용하였음
 * 3. 풀이후기
 *  - 가장 앞에 있는 사람의 번호를 대상자로 확인해, 반복하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3, 4}, 2)); // 3
        System.out.println(solution(new int[] {1, 2, 3, 4, 5, 6}, 5)); // 3
        System.out.println(solution(new int[] {1, 2, 3}, 3)); // 2
    }

    public static int solution(int[] numbers, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int N = numbers.length;

        for (int n = 0;n < N;n++)
            deque.add(numbers[n]);

        for (int kn = 1;kn < k;kn++) {
            deque.addLast(deque.pollFirst());
            deque.addLast(deque.pollFirst());
        }

        return deque.peekFirst();
    }
}
