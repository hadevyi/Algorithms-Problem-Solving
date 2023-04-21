/**
 * 1. 문제정보
 *  - 제목 : n개 간격의 원소들
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181888
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] num_list, int n) {
        int N = num_list.length % n == 0 ? num_list.length / n : num_list.length / n + 1;
        int idx = 0;
        int[] answer = new int[N];
        for (int i = 0;i < num_list.length;i+=n)
            answer[idx++] = num_list[i];
        return answer;
    }
}