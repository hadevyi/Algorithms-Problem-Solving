/**
 * 1. 문제정보
 *  - 제목 : n보다 커질 때까지 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181884
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] numbers, int n) {
        int answer = 0;
        for (int number : numbers) {
            answer += number;
            if (answer > n) 
                return answer;
        }
        return answer;
    }
}