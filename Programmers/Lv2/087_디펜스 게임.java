import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 디펜스 게임
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/142085
 *  2. 풀이핵심
 *  - 특정 케이스에 가장 큰 값을 무적권으로 쓴다.
 * 3. 풀이후기
 *  - 너무 복잡하게 풀려고 해서 어려웠던 것같다. 결국 기준은 n, k개만 사용한다를 신경쓰면 된다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(7, 3, new int[] {4, 2, 4, 5, 3, 3, 1})); // 5
        System.out.println(solution(2, 4, new int[] {3, 3, 3, 3})); // 4
    }

    public static int solution(int n, int k, int[] enemy) {
        if (enemy.length <= k) return enemy.length;

        int answer = 0, sum = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int size = 0;size < enemy.length;size++) {
            sum += enemy[size];
            pq.offer(enemy[size]);
            answer++;

            if (sum > n) {
                if (pq.isEmpty() || k <= 0) {
                    answer--;
                    break;
                } else {
                    int value = pq.poll();
                    sum -= value;
                    k--;
                }
            }
        }
        return answer;
    }
}
