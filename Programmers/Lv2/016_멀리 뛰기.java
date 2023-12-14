/**
 * 1. 문제정보
 *  - 제목 : 멀리 뛰기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12914
 *  2. 풀이핵심
 *  - 규칙을 찾아서 출력함
 * 3. 풀이후기
 *  - 직접 구현했다가 시간초과가 나왔다. 간단하게 1~8까지의 결과를 작성해 출력해보았다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(4)); // 5
        System.out.println(solution(3)); // 3
        System.out.println(solution(7));
    }
    public static long solution(int n) {
        long[] data = new long[n + 1];

        for (int i = 1;i <= n;i++) {
            if (i <= 2) data[i] = i;
            else data[i] = (data[i - 1] + data[i - 2]) % 1234567;
        }

        return data[n];
    }
}
