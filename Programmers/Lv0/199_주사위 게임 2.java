/**
 * 1. 문제정보
 *  - 제목 : 주사위 게임 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181930
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int b, int c) {
        int answer = 0;
        if (a == b && b == c)
            answer = (a + b + c) * (a * a + b * b + c * c) * (a * a * a + b * b * b + c * c * c);
        else if ((a == b && b != c) || (a == c && a != b) || (b == c && a != b))
            answer = (a + b + c) * (a * a + b * b + c * c);
        else
            answer = a + b + c;
        return answer;
    }
}