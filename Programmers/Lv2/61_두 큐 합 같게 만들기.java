/**
 * 1. 문제정보
 *  - 제목 : 두 큐 합 같게 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/118667
 *  2. 풀이핵심
 *  - 투포인터 사용하기
 * 3. 풀이후기
 *  - 재검사와 확인을 위해 투포인터로 접근하였는데, start-end를 다루는 것이 조금 어려웠다.
 *  - 더 익숙해지도록 노력해야겠다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(new int[] {1, 2, 3}, new int[] {1, 2, 3})); // 0
        System.out.println(solution(new int[] {3, 2, 7, 2}, new int[] {4, 6, 5, 1})); // 2
        System.out.println(solution(new int[] {1, 2, 1, 2}, new int[] {1, 10, 1, 2})); // 7
        System.out.println(solution(new int[] {1, 1}, new int[] {1, 5})); // -1
        System.out.println(solution(new int[] {1, 4}, new int[] {4, 8})); // -1
        System.out.println(solution(new int[] {1, 4}, new int[] {3, 4})); // -1
    }

    public static int solution(int[] queue1, int[] queue2) {
        long total = 0, queueSum = 0;
        for (int data : queue1) queueSum += data;
        for (int data : queue2) total += data;
        total += queueSum;
        int[] checkQueue = getQueue(queue1, queue2);
        int N = checkQueue.length, start = 0, end = queue1.length, answer = 0;

        if (total % 2 == 1) return -1; // 홀수이면 반으로 구별할 수 없음
        while (start <= end) {
            if (total - queueSum == queueSum) return answer;
            if (end == N && (total - queueSum) < queueSum) break;

            answer++;
            if (queueSum < total / 2) queueSum += checkQueue[end++];
            else queueSum -= checkQueue[start++];
        }

        return -1;
    }

    public static int[] getQueue(int[] queue1, int[] queue2) {
        int N = queue1.length + queue2.length;
        int[] result = new int[N];
        int index = 0;
        for (int data : queue1) result[index++] = data;
        for (int data : queue2) result[index++] = data;
        return result;
    }
}
