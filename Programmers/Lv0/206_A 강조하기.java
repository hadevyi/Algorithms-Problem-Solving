/**
 * 1. 문제정보
 *  - 제목 : A 강조하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181874
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String solution(String myString) {
        myString = myString.toLowerCase();
        return myString.replace("a", "A");
    }
}