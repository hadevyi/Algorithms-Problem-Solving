/**
 * 1. 문제정보
 *  - 제목 : 문자 개수 세기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181902
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        for (char ch : my_string.toCharArray()) {
            if ('A' <= ch && ch <= 'Z')
                answer[ch - 'A']++;
            else
                answer[ch - 'a' + 26]++;
        }
        return answer;
    }
}