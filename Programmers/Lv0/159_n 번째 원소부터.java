/**
 * 1. 문제정보
 *  - 제목 : n 번째 원소부터
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181892
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length - n + 1];
        for (int i = n - 1;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
}