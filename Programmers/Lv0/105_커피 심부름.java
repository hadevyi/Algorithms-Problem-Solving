/**
 * 1. 문제정보
 *  - 제목 : 커피 심부름
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181837
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(String[] order) {
        int answer = 0;
        for (String eachOrder : order) {
            if (eachOrder.contains("americano") || eachOrder.equals("anything"))
                answer += 4500;
            else 
                answer += 5000;
        }
        return answer;
    }
}