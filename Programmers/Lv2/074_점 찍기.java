/**
 * 1. 문제정보
 *  - 제목 : 점 찍기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/140107
 *  2. 풀이핵심
 *  - 반지름과 원의 둘레 상관관계
 * 3. 풀이후기
 *  - x^2 + y^2 = r^2를 활용해서 진행했다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 4)); // 6
        System.out.println(solution(1, 5)); // 26
    }

    public static long solution(int k, int d) {
        // x^2 + y^2 = r^2
        long R = (long) d * d;
        long answer = 0;

        for (int i = 0;i <= d;i += k) {
            long iSum = (long) i * i;
            double temp = Math.sqrt(R - iSum);
            answer += (int)temp / k + 1;
        }
        return answer;
    }
}
