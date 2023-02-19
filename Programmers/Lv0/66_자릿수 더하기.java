/**
 * 1. 문제정보
 *  - 제목 : 자릿수 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120906
 *  2. 풀이핵심
 *  - 전체의 모든 자리를 합하기
 * 3. 풀이후기
 *  - 간단하게 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(1234)); // 10
        System.out.println(solution(930211)); // 16
    }

    public static int solution(int n) {
        String str = Integer.toString(n);
        int answer = 0, N = str.length();
        for (int i = 0;i < N;i++)
            answer += str.charAt(i) - '0';
        return answer;
    }
}
