/**
 * 1. 문제정보
 * - 제목 : [PCCE 기출문제] 6번 / 가채점
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250128
 * 2. 풀이핵심
 * - 디버깅 문제 - 한줄 수정
 * 3. 풀이후기
 * - 간단한 문제 풀이
 */
class Solution {
    public String[] solution(int[] numbers, int[] our_score, int[] score_list) {
        int num_student = numbers.length;
        String[] answer = new String[num_student];

        for (int i = 0; i < num_student; i++) {
            if (our_score[i] == score_list[numbers[i] - 1]) {
                answer[i] = "Same";
            }
            else {
                answer[i] = "Different";
            }
        }

        return answer;
    }
}
