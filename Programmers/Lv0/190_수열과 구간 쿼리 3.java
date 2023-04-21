/**
 * 1. 문제정보
 *  - 제목 : 수열과 구간 쿼리 3
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181924
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int i = query[0], j = query[1];
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }
}