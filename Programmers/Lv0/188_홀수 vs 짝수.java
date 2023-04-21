/**
 * 1. 문제정보
 *  - 제목 : 홀수 vs 짝수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181887
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list) {
        int even = 0, odd = 0;
        for (int i = 0;i < num_list.length;i++) {
            if (i % 2 == 0) odd += num_list[i];
            else even += num_list[i];
        }
        return Math.max(even, odd);
    }
}