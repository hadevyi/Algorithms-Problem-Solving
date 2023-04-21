/**
 * 1. 문제정보
 *  - 제목 : 조건 문자열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181934
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        boolean answer = false;
        if (ineq.equals(">") && eq.equals("="))
            answer = n >= m;
        else if (ineq.equals("<") && eq.equals("="))
            answer = n <= m;
        else if (ineq.equals(">") && eq.equals("!"))
            answer = n > m;
        else 
            answer = n < m;
        return answer ? 1 : 0;
    }
}