/**
 * 1. 문제정보
 *  - 제목 : 자릿수 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12931
 *  2. 풀이핵심
 *  - 숫자의 모든 자리수를 합해서 진행
 * 3. 풀이후기
 *  - 각 자리를 합해 결과를 반환하는 것
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(123)); // 6
        System.out.println(solution(987)); // 24
    }

    public static int solution(int n) {
        int answer = 0;

        for (char data : Integer.toString(n).toCharArray())
            answer += data - '0';

        return answer;
    }
}
