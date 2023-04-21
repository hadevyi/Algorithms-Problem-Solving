/**
 * 1. 문제정보
 *  - 제목 : 날짜 비교하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181838
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int[] date1, int[] date2) {
        int date1Days = getTotalDays(date1);
        int date2Days = getTotalDays(date2);
        return date1Days < date2Days ? 1 : 0;
    }
    
    public int getTotalDays(int[] date) {
        int result = 0;
        result += date[0] * 360;
        result += date[1] * 30;
        result += date[2];
        return result;
    }
}