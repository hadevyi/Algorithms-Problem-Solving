/**
 * 1. 문제정보
 *  - 제목 : 공배수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181936
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int number, int n, int m) {
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}