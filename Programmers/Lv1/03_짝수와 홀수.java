/**
 * 1. 문제정보
 *  - 제목 : 짝수와 홀수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12937
 *  2. 풀이핵심
 *  - 짝/홀수를 확인하기
 * 3. 풀이후기
 *  - 삼항연산자로 간단하게 구현할 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3)); // Odd
        System.out.println(solution(4)); // Even
    }

    public static String solution(int num) {
        return num % 2 == 0 ? "Even" : "Odd";
    }
}
