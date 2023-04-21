/**
 * 1. 문제정보
 *  - 제목 : 특별한 이차원 배열 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181831
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[][] arr) {
        int N = arr.length;
        for (int i = 0;i < N;i++)
            for (int j = 0;j < N;j++) {
                if (i == j) continue;
                if (arr[i][j] != arr[j][i]) return 0;
            }
        return 1;
    }
}