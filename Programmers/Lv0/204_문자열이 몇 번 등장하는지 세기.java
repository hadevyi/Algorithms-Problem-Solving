/**
 * 1. 문제정보
 *  - 제목 : 문자열이 몇 번 등장하는지 세기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181871
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String myString, String pat) {
        int answer = 0, n = pat.length();
        for (int i = 0;i + n <= myString.length();i++)
            if (myString.substring(i, i + n).equals(pat))
                answer++;
        return answer;
    }
}