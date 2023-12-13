/**
 * 1. 문제정보
 *  - 제목 : 두 수의 차
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120803
 *  2. 풀이핵심
 *  - 간단한 사칙연산
 * 3. 풀이후기
 *  - 수식 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 3)); // -1
        System.out.println(solution(100, 2)); // 98
    }

    public static int solution(int num1, int num2) {
        return num1 - num2;
    }
}
