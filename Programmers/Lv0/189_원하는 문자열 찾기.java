/**
 * 1. 문제정보
 *  - 제목 : 원하는 문자열 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181878
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String myString, String pat) {
        if (myString.length() < pat.length()) return 0;
        myString = myString.toLowerCase();
        pat = pat.toLowerCase();
        int n = pat.length();
        for (int i = 0;i + n <= myString.length();i++) {
            if (myString.substring(i, i + n).equals(pat))
                return 1;
        }
        return 0;
    }
}