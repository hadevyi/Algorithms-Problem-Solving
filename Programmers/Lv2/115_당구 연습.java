/**
 * 1. 문제정보
 *  - 제목 : 당구 연습
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/169198
 *  2. 풀이핵심
 *  - 대소 비교 및 수학
 * 3. 풀이후기
 *  - 대칭을 진행해 두 점사이의 거리를 구하는 식으로 진행하였다.
 */
class Solution {
    public int[] solution(int m, int n, int startX, int startY, int[][] balls) {
        int[] answer = new int[balls.length];
        
        for (int i = 0;i < balls.length;i++) {
            int minLength = Integer.MAX_VALUE;
            int nowX = balls[i][0], nowY = balls[i][1];
            
            if (startY != nowY) {
                // Y축을 기준으로 반전해서 직선을 구하기
                int newX = -1 * nowX;
                int reversalToZero = (startX - newX) * (startX - newX)
                    + (startY - nowY) * (startY - nowY);
                
                newX = nowX + (m - nowX) * 2;
                int reversalToM = (startX - newX) * (startX - newX)
                    + (startY - nowY) * (startY - nowY);
                
                minLength = Math.min(minLength, reversalToZero);
                minLength = Math.min(minLength, reversalToM);
            } else {
                // Y가 같을 때, startX의 값이 크면 m으로 갔다가 nowX로 가고,
                // startX의 값이 작으면 0으로 갔다가 nowX로 간다.
                int length = 0;
                if (startX > nowX) {
                    length = (m - startX) + (m - nowX);
                } else {
                    length = startX + nowX;
                }
                minLength = Math.min(minLength, length * length);
            }
            
            if (startX != nowX) {
                // X축을 기준으로 반전해서 직선을 구하기
                int newY = -1 * nowY;
                int reversalToZero = (startX - nowX) * (startX - nowX)
                    + (startY - newY) * (startY - newY);
                
                newY = nowY + (n - nowY) * 2;
                int reversalToN = (startX - nowX) * (startX - nowX)
                    + (startY - newY) * (startY - newY);
                
                minLength = Math.min(minLength, reversalToZero);
                minLength = Math.min(minLength, reversalToN);
            } else {
                // X가 같을 때, startY의 값이 크면 n으로 갔다가 nowY로 가고,
                // startY의 값이 작으면 0으로 갔다가 nowY로 간다.
                int length = 0;
                if (startY < nowY) {
                    length = startY + nowY;
                } else {
                    length = (n - startY) + (n - nowY);
                }
                minLength = Math.min(minLength, length * length);
            }
            
            answer[i] = minLength;
        }
        
        return answer;
    }
}