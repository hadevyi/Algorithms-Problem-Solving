import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 혼자 놀기의 달인
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131130
 *  2. 풀이핵심
 *  - bfs와 pq 진행
 * 3. 풀이후기
 *  - 마지막의 예외조건을 작성해주어야함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {8, 6, 3, 7, 2, 5, 1, 4})); // 12
    }

    public static boolean[] isVisited;
    public static PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
    public static int solution(int[] cards) {
        isVisited = new boolean[cards.length + 1]; // 0 dummy
        for (int card : cards) {
            if (isVisited[card]) continue;
            bfs(card, cards);
        }
        if (pq.size() == 1) return 0;
        return pq.poll() * pq.poll();
    }

    public static void bfs(int value, int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(value);
        int result = 0;

        while (!queue.isEmpty()) {
            int v = queue.poll();

            if (isVisited[v]) continue;

            isVisited[v] = true;
            queue.offer(arr[v - 1]);
            result++;
        }

        pq.offer(result);
    }
}
