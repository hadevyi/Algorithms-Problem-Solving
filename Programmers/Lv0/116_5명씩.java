/**
 * 1. 문제정보
 *  - 제목 : 5명씩
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181886
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public String[] solution(String[] names) {
        int idx = 0;
        String[] answer = new String[names.length % 5 == 0 ? names.length / 5 : names.length / 5 + 1];
        for (int i = 0;i < names.length;i+=5)
            answer[idx++] = names[i];
        return answer;
    }
}