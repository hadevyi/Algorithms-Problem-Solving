import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 더 맵게
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42626
 *  2. 풀이핵심
 *  - 길이의 범위가 넓다.
 * 3. 풀이후기
 *  - 최소일 때와 최대일 때를 고려해야함을 유의해야한다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1,2,3,9,10,12}, 7)); // 2
    }
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int score : scoville)
            pq.offer(score);

        while (pq.size() >= 2) {
            // 검사를 더 해야할지 확인
            int checkData = pq.peek();
            if (checkData >= K) break;

            // 추가 단계 진행
            answer++;
            int min1st = pq.poll();
            int min2nd = pq.poll();
            pq.offer(min1st + min2nd * 2);
        }

        if (pq.peek() < K) return -1;
        return answer;
    }
}
