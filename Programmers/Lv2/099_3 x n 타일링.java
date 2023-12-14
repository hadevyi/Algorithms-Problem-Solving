/**
 * 1. 문제정보
 *  - 제목 : 3 x n 타일링
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12902#
 *  2. 풀이핵심
 *  - 다이나믹 프로그래밍
 * 3. 풀이후기
 *  - 규칙찾기 너무 어렵고 난감했던 문제
 */
class Solution {
    public long MOD = 1000000007;
    public int solution(int n) {
        if (n % 2 == 1) return 0; // 홀수면 0

        long[] DP = new long[n + 1];
        DP[0] = 1;
        DP[2] = 3;
        long sum = 0;

        for (int i = 4;i <= n;i += 2) {
            DP[i] = (DP[i - 2] * 3 + sum * 2 + 2) % MOD;
            sum = (sum + DP[i - 2]) % MOD;
        }

        return (int) DP[n];
    }
}