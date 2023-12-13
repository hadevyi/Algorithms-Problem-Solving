import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 회전시키기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120844
 *  2. 풀이핵심
 *  - 앞뒤로 모두 데이터를 넣고 뺄수 있어야 함
 * 3. 풀이후기
 *  - deque로 간단하게 해결할 수 있었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3}, "right"))); // [3, 1, 2]
        System.out.println(Arrays.toString(solution(new int[] {4, 455, 6, 4, -1, 45, 6}, "left"))); // [455, 6, 4, -1, 45, 6, 4]
    }

    public static int[] solution(int[] numbers, String direction) {
        Deque<Integer> deque = new LinkedList<>();
        int N = numbers.length;

        for (int n = 0;n < N;n++)
            deque.add(numbers[n]);

        if (direction.equals("right"))
            deque.addFirst(deque.pollLast());
        else
            deque.addLast(deque.pollFirst());

        int[] answer = new int[N];
        int idx = 0;
        while (!deque.isEmpty())
            answer[idx++] = deque.pollFirst();
        return answer;
    }
}
