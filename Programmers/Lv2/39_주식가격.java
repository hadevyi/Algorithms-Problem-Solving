import java.util.Arrays;

/**
 * 1. 문제정보
 *  - 제목 : 주식가격
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/42584
 *  2. 풀이핵심
 *  - 현재를 기준으로 다음 값부터 마지막까지 확인하기
 * 3. 풀이후기
 *  - 단순한 구현 문제로 접근해서 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new int[] {1, 2, 3, 2, 3}))); // [4, 3, 1, 1, 0]
    }

    public static int[] solution(int[] prices) {
        int N = prices.length;
        int[] answer = new int[N];
        for (int n = 0;n < N;n++)
            answer[n] = getCheck(prices[n], prices, n + 1);
        return answer;
    }

    public static int getCheck(int num, int[] prices, int idx) {
        if (prices.length == idx) return 0;
        int count = 0;
        for (int i = idx;i < prices.length;i++)
            if (prices[i] >= num) count++;
            else return count + 1;
        return count;
    }
}
