/**
 * 1. 문제정보
 *  - 제목 : 마지막 두 원소
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181927
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] num_list) {
        int idx = 0;
        int[] answer = new int[num_list.length + 1];
        for (int num : num_list)
            answer[idx++] = num;
        if (num_list[num_list.length - 1] > num_list[num_list.length - 2])
            answer[idx] = num_list[num_list.length - 1] - num_list[num_list.length - 2];
        else
            answer[idx] = num_list[num_list.length - 1] * 2;
        return answer;
    }
}