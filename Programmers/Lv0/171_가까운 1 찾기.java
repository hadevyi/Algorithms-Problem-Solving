/**
 * 1. 문제정보
 *  - 제목 : 가까운 1 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181898
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] arr, int idx) {
        for (int i = idx;i < arr.length;i++)
            if (arr[i] == 1)
                return i;
        return -1;
    }
}