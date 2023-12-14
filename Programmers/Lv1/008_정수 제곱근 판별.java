/**
 * 1. 문제정보
 *  - 제목 : 정수 제곱근 판별
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12934
 *  2. 풀이핵심
 *  - 각 제곱근이 맞는지 확인함
 * 3. 풀이후기
 *  - Math.sqrt이 제곱근을 기준으로 결과가 동일하면, 제곱수임을 판별할 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(121)); // 144
        System.out.println(solution(3)); // -1
    }

    public static long solution(long n) {
        if ((long) Math.sqrt(n) * (long) Math.sqrt(n) == n)
            return (long) (Math.sqrt(n) + 1) * (long) (Math.sqrt(n) + 1);
        return -1;
    }
}
