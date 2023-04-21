/**
 * 1. 문제정보
 *  - 제목 : 길이에 따른 연산
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181879
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        if (num_list.length >= 11) {
            for (int num : num_list)
                answer += num;
        } else {
            answer = 1;
            for (int num : num_list)
                answer *= num;
        }
        return answer;
    }
}