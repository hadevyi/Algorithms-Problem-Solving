/**
 * 1. 문제정보
 *  - 제목 : flag에 따라 다른 값 반환하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181933
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int b, boolean flag) {
        return flag ? a + b : a - b;
    }
}