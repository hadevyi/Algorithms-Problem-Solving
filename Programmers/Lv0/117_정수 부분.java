/**
 * 1. 문제정보
 *  - 제목 : 정수 부분
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181850
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(double flo) {
        return Integer.parseInt(Double.toString(flo).substring(0, Double.toString(flo).indexOf(".")));
    }
}