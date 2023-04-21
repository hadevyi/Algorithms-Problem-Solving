/**
 * 1. 문제정보
 *  - 제목 : 순서바꾸기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181891
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] num_list, int n) {
        int idx = 0;
        int[] answer = new int[num_list.length];
        for (int i = n;i < num_list.length;i++)
            answer[idx++] = num_list[i];
        for (int i = 0;i < n;i++)
            answer[idx++] = num_list[i];
        return answer;
    }
}