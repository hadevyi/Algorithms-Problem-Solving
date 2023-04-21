/**
 * 1. 문제정보
 *  - 제목 : 특정 문자열로 끝나는 가장 긴 부분 문자열 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181872
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String myString, String pat) { 
        return myString.substring(0, myString.lastIndexOf(pat) + pat.length());
    }
}