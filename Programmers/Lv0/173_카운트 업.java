/**
 * 1. 문제정보
 *  - 제목 : 카운트 업
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181920
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int start, int end) {
        int idx = 0;
        int[] answer = new int[end - start + 1];
        for (int i = start;i <= end;i++) {
            answer[idx++] = i;
        }
        return answer;
    }
}