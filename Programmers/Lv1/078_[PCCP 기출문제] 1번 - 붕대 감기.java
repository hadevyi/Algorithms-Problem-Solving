/**
 * 1. 문제정보
 * - 제목 : [PCCP 기출문제] 1번 / 붕대 감기
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250137
 * 2. 풀이핵심
 * - 구현문제
 * 3. 풀이후기
 * - 코드가 길지만 제한이 많진 않아 잘 정돈하면 빠르게 풀 수 있는 문제
 */
class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int answer = health, maxTime = attacks[attacks.length - 1][0], attackIdx = 0;
        int comboHealth = 0;
        
        for (int time = 1;time <= maxTime;time++) {
            if (attacks[attackIdx][0] == time) {
                // 공격 시간이라면
                answer -= attacks[attackIdx++][1];
                comboHealth = 0;
            } else {
                // 공격 시간이 아니라면
                comboHealth++;
                answer += bandage[1];
                answer = answer > health ? health : answer;
            }
            
            if (answer <= 0) return -1;
            
            if (comboHealth == bandage[0]) {
                comboHealth = 0;
                answer += bandage[2];
            }
        }
        
        return answer;
    }
}