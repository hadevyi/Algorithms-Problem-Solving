/**
 * 1. 문제정보
 *  - 제목 : 정수 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181840
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list, int n) {
        for (int num : num_list)
            if (num == n)
                return 1;
        return 0;
    }
}