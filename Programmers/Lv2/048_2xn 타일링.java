/**
 * 1. 문제정보
 *  - 제목 : 2 x n 타일링
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12900
 *  2. 풀이핵심
 *  - DP로 진행하면서도 나머지로 진행
 * 3. 풀이후기
 *  - 손으로 1~5까지의 경우의 수를 세어보니 피보나치수열임이 눈에 바로 보였음
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        System.out.println(solution(4)); // 5
    }

    public static int[] memo;
    public static int solution(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        memo = new int[n + 1]; // 0 dummy
        memo[1] = 1;
        memo[2] = 2;

        for (int i = 3;i <= n;i++)
            memo[i] = (memo[i - 1] + memo[i - 2]) % 1000000007;
        return memo[n];
    }
}
