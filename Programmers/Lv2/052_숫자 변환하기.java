import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자 변환하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/154538
 *  2. 풀이핵심
 *  - BFS 구현
 * 3. 풀이후기
 *  - 방문체크로 불필요한 내용을 최소화해서 진행, 최단거리 구하기와 동일
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10, 40, 5)); // 2
        System.out.println(solution(10, 40, 30)); // 10
        System.out.println(solution(2, 5, 4)); // -1
    }

    public static int solution(int x, int y, int n) {
        Queue<Integer> queue = new LinkedList<>();
        boolean[] isVisited = new boolean[y + 1]; // 0 dummy;
        int count = 0;
        queue.offer(x);
        isVisited[x] = true;

        while (!queue.isEmpty()) {
            int SIZE = queue.size();

            for (int size = 0;size < SIZE;size++) {
                int now = queue.poll();
                if (now == y) return count;

                if (now + n <= y && !isVisited[now + n] ) {
                    queue.offer(now + n);
                    isVisited[now + n] = true;
                }

                if (now * 2 <= y && !isVisited[now * 2]) {
                    queue.offer(now * 2);
                    isVisited[now * 2] = true;
                }

                if (now * 3 <= y && !isVisited[now * 3]) {
                    queue.offer(now * 3);
                    isVisited[now * 3] = true;
                }
            }

            count++;
        }
        return -1;
    }
}
