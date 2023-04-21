/**
 * 1. 문제정보
 *  - 제목 : 첫 번째로 나오는 음수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181896
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] num_list) {
        for (int i = 0;i < num_list.length;i++)
            if (num_list[i] < 0)
                return i;
        return -1;
    }
}