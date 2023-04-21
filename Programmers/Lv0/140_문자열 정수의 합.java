/**
 * 1. 문제정보
 *  - 제목 : 문자열 정수의 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181849
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String num_str) {
        int answer = 0;
        for (char ch : num_str.toCharArray())
            answer += ch - '0';
        return answer;
    }
}