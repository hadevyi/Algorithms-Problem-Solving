/**
 * 1. 문제정보
 *  - 제목 : 소수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12921
 *  2. 풀이핵심
 *  - 소수 확인하기
 * 3. 풀이후기
 *  - 직접 구현하였다가 시간초과가 많았음
 *  - 에라토스테네스의 체를 활용해 개선함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10)); // 4
        System.out.println(solution(5)); // 3
    }

    public static int N;
    public static boolean[] isPrime; // 0, 1 dummy
    public static int solution(int n) {
        N = n + 1;
        isPrime = new boolean[N];
        settingPrime();
        int answer = 0;
        for (int i = 2;i < N;i++)
            if (!isPrime[i])
                answer++;
        return answer;
    }

    public static void settingPrime() {
        for (int i = 2;i < N;i++) {
            for (int j = 2;j * i < N;j++)
                isPrime[j * i] = true;
        }
    }
}
