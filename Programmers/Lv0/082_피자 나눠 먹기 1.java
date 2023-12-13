/**
 * 1. 문제정보
 *  - 제목 : 피자 나눠 먹기 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120814
 *  2. 풀이핵심
 *  - 떨어지는 것이 아닌 최소 이상이기에 가능했음
 * 3. 풀이후기
 *  - 단계대로 확인하여 발견하자마자 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(7)); // 1
        System.out.println(solution(1)); // 1
        System.out.println(solution(15)); // 3
    }

    public static int solution(int n) {
        // 1판에 7조각
        if (n < 7) return 1;
        int answer = 0;
        for (int i = 1;i <= n;i++) {
            if ((i * 7) >= n)
                return i;
        }
        return answer;
    }
}
