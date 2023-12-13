/**
 * 1. 문제정보
 *  - 제목 : 제곱수 판별하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120909
 *  2. 풀이핵심
 *  - 자주 사용하지 않았지만, Math.sqrt()를 활용함
 * 3. 풀이후기
 *  - 제곱근의 제곱이 자기자신이 될 때 제곱수라고 할 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(144)); // 1
        System.out.println(solution(976)); // 2
    }

    public static int solution(int n) {
        return (int) Math.sqrt(n) * Math.sqrt(n) == n ? 1 : 2;
    }
}
