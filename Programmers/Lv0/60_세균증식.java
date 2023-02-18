/**
 * 1. 문제정보
 *  - 제목 : 세균 증식
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120910
 *  2. 풀이핵심
 *  - 각 입력값의 최대를 넣어도 int 내로 단순 반복문으로 진행함
 * 3. 풀이후기
 *  - 범위 확인 후 반복문 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 10)); // 2048
        System.out.println(solution(7, 15)); // 229376
        System.out.println(solution(10, 15)); // 327680
    }

    public static int solution(int n, int t) {
        int answer = n;
        for (int i = 0;i < t;i++)
            answer *= 2;
        return answer;
    }
}
