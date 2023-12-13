/**
 * 1. 문제정보
 *  - 제목 : 숫자 비교하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120807
 *  2. 풀이핵심
 *  - 간단한 연산자
 * 3. 풀이후기
 *  - 같은지 확인하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 3)); // -1
        System.out.println(solution(11, 11)); // 1
        System.out.println(solution(7, 99)); // -1
    }

    public static int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
