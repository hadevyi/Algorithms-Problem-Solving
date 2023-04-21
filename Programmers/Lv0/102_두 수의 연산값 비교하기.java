/**
 * 1. 문제정보
 *  - 제목 : 두 수의 연산값 비교하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181938
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int b) {
        int ab = Integer.parseInt(Integer.toString(a) + Integer.toString(b));
        int ab2 = 2 * a * b;
        return ab == ab2 ? ab : Math.max(ab, ab2);
    }
}