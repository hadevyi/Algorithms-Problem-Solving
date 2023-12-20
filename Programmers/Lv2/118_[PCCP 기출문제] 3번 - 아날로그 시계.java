/**
 * 1. 문제정보
 * - 제목 : [PCCP 기출문제] 3번 / 아날로그 시계
 * - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/250135
 * 2. 풀이핵심
 * - 시간 계산하기
 * 3. 풀이후기
 * - 정말 오랜만에 긴 시간 풀이한 문제... 너무 어렵다.
 */
class Solution {
    public int solution(int h1, int m1, int s1, int h2, int m2, int s2) {
        int answer = 0;
        
        int startTime = getSecTime(h1, m1, s1);
        int endTime = getSecTime(h2, m2, s2);
        
        double[] beforeDeg = getDeg(startTime);
        if (isAllAccord(beforeDeg)) answer++;
        
        for (int time = startTime + 1;time <= endTime;time++) {
            double[] nowDeg = getDeg(time);
            
            if (isAllAccord(nowDeg)) {
                beforeDeg = nowDeg;
                answer++;
                continue;
            }
            
            if (isPass(beforeDeg, nowDeg, 0, 2)) answer++;
            if (isPass(beforeDeg, nowDeg, 1, 2)) answer++;
            
            beforeDeg = nowDeg;
        }
        
        return answer;
    }
    
    public int getSecTime(int h, int m, int s) {
        return h * 60 * 60 + m * 60 + s;
    }
    
    public boolean isAllAccord(double[] angle) {
        return angle[0] == angle[2] || angle[1] == angle[2];
    }
    
    public boolean isPass(double[] beforeDeg, double[] nowDeg, int hourOrMin, int sec) {
        return (beforeDeg[sec] < beforeDeg[hourOrMin] && nowDeg[hourOrMin] <= nowDeg[sec]) ||
            (beforeDeg[sec] < beforeDeg[hourOrMin] && nowDeg[sec] == 0);
    }
    
    public final double HOUR_ANGLE = 30.0 / 60 / 60;
    public final double MIN_ANGLE = 6.0 / 60;
    public final double SEC_ANGLE = 6.0;
    public double[] getDeg(int secTime) {
        return new double[] {(secTime * HOUR_ANGLE) % 360,
                            (secTime * MIN_ANGLE) % 360,
                            (secTime * SEC_ANGLE) % 360};
    }
}