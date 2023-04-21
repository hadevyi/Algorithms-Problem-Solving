/**
 * 1. 문제정보
 *  - 제목 : 간단한 논리 연산
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181917 
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        return (x1 || x2) && (x3 || x4);
    }
}