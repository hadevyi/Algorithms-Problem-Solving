/**
 * 1. 문제정보
 *  - 제목 : 369게임
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120891
 *  2. 풀이핵심
 *  - 3의 배수인지 확인하며, 0인지 고려해야함
 * 3. 풀이후기
 *  - 0을 고려하지 않아 첫 시도 실패했으나 해결함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(3)); // 1
        System.out.println(solution(29423)); // 2
    }

    public static int solution(int order) {
        String str = Integer.toString(order);
        int Len = str.length(), answer = 0;

        for (int len = 0;len < Len;len++)
            if ((str.charAt(len) - '0') % 3 == 0 && str.charAt(len) != '0')
                answer++;

        return answer;
    }
}
