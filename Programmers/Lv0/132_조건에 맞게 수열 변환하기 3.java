/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞게 수열 변환하기 3
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181835
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0;i < arr.length;i++)
                arr[i] = arr[i] + k;
        } else {
            for (int i = 0;i < arr.length;i++)
                arr[i] = arr[i] * k;
        }
        return arr;
    }
}