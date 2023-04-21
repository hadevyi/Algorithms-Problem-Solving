/**
 * 1. 문제정보
 *  - 제목 : 정수를 나선형으로 배치하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181832
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 0, i = 0, j = -1, length = n;
        while (num <= n*n) {
            for (int reap = 0;reap < length;reap++)
                answer[i][++j] = ++num;
            
            length -= 1;
            
            for (int reap = 0;reap < length;reap++)
                answer[++i][j] = ++num;
            
            for (int reap = 0;reap < length;reap++)
                answer[i][--j] = ++num;
            
            length -= 1;
            if (num == n * n) break;
            
            for (int reap = 0;reap<length;reap++)
                answer[--i][j] = ++num;
        }
        return answer;
    }
}