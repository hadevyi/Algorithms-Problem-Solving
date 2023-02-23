/**
 * 1. 문제정보
 *  - 제목 : 나이 출력
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120820
 *  2. 풀이핵심
 *  - 간단한 수식연산
 * 3. 풀이후기
 *  - 수식 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(40)); // 1983
        System.out.println(solution(23)); // 2000
    }

    public static int solution(int age) {
        return 2022 - age + 1;
    }
}
