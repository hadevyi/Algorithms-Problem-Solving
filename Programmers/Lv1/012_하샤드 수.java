/**
 * 1. 문제정보
 *  - 제목 : 하샤드 수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12947
 *  2. 풀이핵심
 *  - 합에 대한 나누어떨어지는 값 확인하기
 * 3. 풀이후기
 *  - 간단한 구현 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10)); // true
        System.out.println(solution(12)); // true
        System.out.println(solution(11)); // false
        System.out.println(solution(13)); // false
    }

    public static boolean solution(int x) {
        int sum = 0;

        for (char data : Integer.toString(x).toCharArray())
            sum += data - '0';

        return x % sum == 0;
    }
}
