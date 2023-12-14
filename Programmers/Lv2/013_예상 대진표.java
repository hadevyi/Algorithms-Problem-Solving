/**
 * 1. 문제정보
 *  - 제목 : 예상 대진표
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12985
 *  2. 풀이핵심
 *  - 핵심 위치만 작성해서 진행함
 * 3. 풀이후기
 *  - A와 B의 현재 위치와 다음 위치를 계산해서 진행했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(8, 4, 7)); // 3
    }

    public static int solution(int n, int a, int b) {
        int answer = 0, round = 1;

        while (n > 0) {
            a = a % 2 == 0 ? a / 2 : a / 2 + 1;
            b = b % 2 == 0 ? b / 2 : b / 2 + 1;

            if (a == b) return round;

            round++;
        }

        return answer;
    }
}
