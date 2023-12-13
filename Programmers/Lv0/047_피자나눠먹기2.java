/**
 * 1. 문제정보
 *  - 제목 : 피자 나눠 먹기 (2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120815
 *  2. 풀이핵심
 *  - 배수를 고민하고 나머지 연산자를 활용함
 * 3. 풀이후기
 *  - 간단한 내용으로 가능함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(6)); // 1
        System.out.println(solution(10)); // 5
        System.out.println(solution(4)); // 2
    }

    public static int solution(int n) {
        // 6조각씩 제공하는 피자 1판
        int answer = 0;

        for (int i = 1;i <= 100;i++)
            if ((i * 6) % n == 0)
                return i;

        return answer;
    }
}
