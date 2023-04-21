/**
 * 1. 문제정보
 *  - 제목 : 등차수열의 특정한 항만 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181931
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int[] array = new int[included.length];
        array[0] = a;
        for (int i = 1;i < included.length;i++)
            array[i] = array[i - 1] + d;
        int answer = 0;
        for (int i = 0;i < included.length;i++)
            if (included[i])
                answer += array[i];
        return answer;
    }
}