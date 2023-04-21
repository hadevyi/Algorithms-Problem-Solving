/**
 * 1. 문제정보
 *  - 제목 : 배열 만들기 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181901
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int n, int k) {
        int idx = 0;
        int[] answer = new int[n / k];
        for (int i = k;i <= n;i += k)
            answer[idx++] = i;
        return answer;
    }
}