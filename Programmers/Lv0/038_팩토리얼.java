/**
 * 1. 문제정보
 *  - 제목 : 팩토리얼
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120848
 *  2. 풀이핵심
 *  - 범위에 해당하는 최소의 수를 반환함
 * 3. 풀이후기
 *  - 작은 범위로 먼저 정의 후 조건을 확인함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3628800)); // 10
        System.out.println(solution(7)); // 3
    }

    public static int solution(int n) {
        int N = 11, number = 1;
        int[] factorial = new int[N]; // 0 dummy
        factorial[0] = factorial[1] = 1;

        for (int i = 2;i < N;i++)
            factorial[i] = factorial[i - 1] * i;

        for (int i = 1;i < N;i++) {
            if (factorial[i] == n) return i;
            if (factorial[i] <= n && n < factorial[i + 1] - 1)
                return i;
        }

        return number;
    }
}
