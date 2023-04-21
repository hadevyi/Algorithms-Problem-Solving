/**
 * 1. 문제정보
 *  - 제목 : 조건에 맞게 수열 변환하기 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181882
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr) {
        for (int i = 0;i < arr.length;i++) {
            if (arr[i] >= 50 && arr[i] % 2 == 0) 
                arr[i] /= 2;
            else if (arr[i] < 50 && arr[i] % 2 == 1)
                arr[i] *= 2;
        }
        return arr;
    }
}