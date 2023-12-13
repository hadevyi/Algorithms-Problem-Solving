/**
 * 1. 문제정보
 *  - 제목 : 두 수의 나눗셈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120806
 *  2. 풀이핵심
 *  - 계산 결과를 확인하기
 * 3. 풀이후기
 *  - 실수과 정수가 필요한 위치에서 확인하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3, 2)); // 1500
        System.out.println(solution(7, 3)); // 2333
        System.out.println(solution(1, 16)); // 62
    }

    public static int solution(int num1, int num2) {
        return (int) ((double) num1 / (double) num2 * 1000.0);
    }
}
