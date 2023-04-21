/**
 * 1. 문제정보
 *  - 제목 : x 사이의 개수
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181867
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(String myString) {
        String[] result = myString.split("x");
        int N = myString.charAt(myString.length() - 1) == 'x' ? result.length + 1 : result.length;
        int[] answer = new int[N];
        for (int i = 0;i < result.length;i++)
            answer[i] = result[i].length();
        return answer;
    }
}