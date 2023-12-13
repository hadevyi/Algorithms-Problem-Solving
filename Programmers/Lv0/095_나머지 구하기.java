/**
 * 1. 문제정보
 *  - 제목 : 나머지 구하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120810
 *  2. 풀이핵심
 *  - 간단한 사칙연산
 * 3. 풀이후기
 *  - 수식 진행
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 2)); // 1
        System.out.println(solution(10, 5)); // 0
    }

    public static int solution(int num1, int num2) {
        return num1 % num2;
    }
}
