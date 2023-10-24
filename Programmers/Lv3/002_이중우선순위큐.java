import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 이중우선순위큐
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42628
 *  2. 풀이핵심
 *  - 문자열 정돈 및 PriorityQueue 사용하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(new String[] {"I 16", "I -5643", "D -1", "D 1", "D 1", "I 123", "D -1"})));                     // [0, 0]
        System.out.println(Arrays.toString(solution(new String[] {"I -45", "I 653", "D 1", "I -642", "I 45", "I 97", "D 1", "D -1", "I 333"})));    // [333, -45]
    }

    public static int[] solution(String[] operations) {
        int MIN = Integer.MAX_VALUE, MAX = Integer.MIN_VALUE;
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for (String operation : operations) {
            if (operation.equals("D 1")) {
                PriorityQueue<Integer> newPQ = new PriorityQueue<>();

                for (int i = 0;i < pq.size() - 1;i++)
                    newPQ.offer(pq.poll());

                pq = newPQ;
            } else if (operation.equals("D -1")) {
                pq.poll();
            } else {
                StringTokenizer st = new StringTokenizer(operation);
                String command = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                pq.offer(num);
            }
        }

        if (pq.isEmpty()) return new int[] {0, 0};

        while (!pq.isEmpty()) {
            int num = pq.poll();
            MAX = Math.max(MAX, num);
            MIN = Math.min(MIN, num);
        }
        return new int[] { MAX, MIN };
    }
}