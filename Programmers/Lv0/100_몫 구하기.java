/**
 * 1. 문제정보
 *  - 제목 : 몫 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120805
 *  2. 풀이핵심
 *  - 간단한 사칙연산
 * 3. 풀이후기
 *  - 수식 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10, 5)); // 2
        System.out.println(solution(7, 2)); // 3
    }

    public static int solution(int num1, int num2) {
        return num1 / num2;
    }
}
