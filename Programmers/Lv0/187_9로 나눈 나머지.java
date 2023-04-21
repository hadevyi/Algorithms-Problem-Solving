/**
 * 1. 문제정보
 *  - 제목 : 9로 나눈 나머지
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181914
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String number) {
        int answer = 0;
        for (char ch : number.toCharArray())
            answer += ch - '0';
        return answer % 9;
    }
}