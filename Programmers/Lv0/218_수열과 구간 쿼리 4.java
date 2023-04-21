/**
 * 1. 문제정보
 *  - 제목 : 수열과 구간 쿼리 4
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181922
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];
            
            for (int i = 0;i < arr.length;i++)
                if (s <= i && i <= e && i % k == 0)
                    arr[i] += 1;
        }
        return arr;
    }
}