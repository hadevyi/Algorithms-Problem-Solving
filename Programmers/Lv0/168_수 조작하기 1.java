/**
 * 1. 문제정보
 *  - 제목 : 수 조작하기 1
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181926
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int n, String control) {
        for (char ch : control.toCharArray()) {
            if (ch == 'w') n += 1;
            else if (ch == 's') n -= 1;
            else if (ch == 'd') n += 10;
            else n -= 10;
        }
        return n;
    }
}