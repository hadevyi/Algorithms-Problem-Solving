/**
 * 1. 문제정보
 *  - 제목 : 간단한 식 계산하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181865
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String binomial) {
        String[] binoList = binomial.split(" ");
        int answer = 0;
        if (binoList[1].equals("+"))
            answer = Integer.parseInt(binoList[0]) + Integer.parseInt(binoList[2]);
        else if (binoList[1].equals("-"))
            answer = Integer.parseInt(binoList[0]) - Integer.parseInt(binoList[2]);
        else if (binoList[1].equals("*"))
            answer = Integer.parseInt(binoList[0]) * Integer.parseInt(binoList[2]);
        return answer;
    }
}