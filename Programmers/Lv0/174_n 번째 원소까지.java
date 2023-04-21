/**
 * 1. 문제정보
 *  - 제목 : n 번째 원소까지
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181889
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] num_list, int n) {
        int[] answer = new int[num_list.length - (num_list.length - n)];
        for (int i = 0;i < n;i++)
            answer[i] = num_list[i];
        return answer;
    }
}