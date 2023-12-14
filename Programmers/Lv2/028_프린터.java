import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 프린터
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42587
 *  2. 풀이핵심
 *  - 대기목록 역시 계속 방문한다.
 * 3. 풀이후기
 *  - 문제 이해도가 부족했다. 대기목록이 초기 기준이 아닌 계쏙 반복하며 확인하는 것이 중요하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {2, 1, 3, 2}, 2)); // 1
        System.out.println(solution(new int[] {1, 1, 9, 1, 1, 1}, 0)); // 5
        System.out.println(solution(new int[] {4, 3, 2, 1}, 1)); // 2
        System.out.println(solution(new int[] {1, 1, 1, 2}, 2)); // 4
        System.out.println(solution(new int[] {1, 2, 3}, 0)); // 3
    }
    public static int solution(int[] priorities, int location) {
        int N = priorities.length, count = 1;
        Deque<Print> printDeque = new LinkedList<>();
        for (int n = 0;n < N;n++)
            printDeque.offerLast(new Print(n, priorities[n]));

        while (!printDeque.isEmpty()) {
            Print nowPrint = printDeque.pollFirst();
            int SIZE = printDeque.size();
            boolean isPrint = true;

            for (int size = 0;size < SIZE;size++) {
                Print checkPrint = printDeque.pollFirst();
                if (checkPrint.priority > nowPrint.priority)
                    isPrint = false;
                printDeque.offerLast(checkPrint);
            }

            if (isPrint) {
                if (nowPrint.idx == location)
                    return count;
                count++;
            } else {
                printDeque.offerLast(nowPrint);
            }
        }
        return -1;
    }

    public static class Print{
        int idx;
        int priority;
        public Print(int idx, int priority) {
            this.idx = idx;
            this.priority = priority;
        }
    }
}
