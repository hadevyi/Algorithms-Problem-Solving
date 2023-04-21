/**
 * 1. 문제정보
 *  - 제목 : 배열의 길이에 따라 다른 연산하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181854
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr, int n) {
        int idx = arr.length % 2 == 0 ? 1 : 0;
        for (int i = idx;i < arr.length;i += 2)
            arr[i] += n;
        return arr;
    }
}