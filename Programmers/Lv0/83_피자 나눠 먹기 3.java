/**
 * 1. 문제정보
 *  - 제목 : 피자 나눠 먹기 (3)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120816
 *  2. 풀이핵심
 *  - 입력에 대한 조건을 구현하기
 * 3. 풀이후기
 *  - 이전 문제를 응용하면 되어서 쉬웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(7, 10)); // 2
        System.out.println(solution(4, 12)); // 3
    }

    public static int solution(int slice, int n) {
        // 1판에 slice 조각
        if (n < slice) return 1;
        int answer = 0;
        for (int i = 1;i <= n;i++) {
            if ((i * slice) >= n)
                return i;
        }
        return answer;
    }
}
