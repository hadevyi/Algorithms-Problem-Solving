/**
 * 1. 문제정보
 *  - 제목 : 정사각형으로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181830
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[][] solution(int[][] arr) {
        if (arr.length == arr[0].length) return arr;
        
        int N = Math.max(arr.length, arr[0].length);
        int[][] answer = new int[N][N];
        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) {
                if (i >= arr.length || j >= arr[0].length)
                    answer[i][j] = 0;
                else 
                    answer[i][j] = arr[i][j];
            }
        }
        return answer;
    }
}