/**
 * 1. 문제정보
 *  - 제목 : 짝수의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120831
 *  2. 풀이핵심
 *  - 합을 진행하는 중의 조건 확인
 * 3. 풀이후기
 *  - 이번엔 if이 아니라 범위와 증가값으로 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(10)); // 30
        System.out.println(solution(4)); // 6
    }

    public static int solution(int n) {
        int answer = 0;
        for (int i = 2;i <= n;i+=2)
            answer += i;
        return answer;
    }
}
