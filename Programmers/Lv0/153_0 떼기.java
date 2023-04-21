/**
 * 1. 문제정보
 *  - 제목 : 0 떼기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181847
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String n_str) {
        int idx = -1;
        for (int i = 0;i < n_str.length();i++)
            if (n_str.charAt(i) >= '1') {
                idx = i;
                break;
            }
        return n_str.substring(idx);
    }
}