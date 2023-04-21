/**
 * 1. 문제정보
 *  - 제목 : 원소들의 곱과 합
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181929
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list) {
        int sum = 0, mul = 1;
        for (int num : num_list) {
            sum += num;
            mul *= num;
        }
        return sum * sum > mul ? 1 : 0;
    }
}