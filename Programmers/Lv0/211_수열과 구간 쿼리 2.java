/**
 * 1. 문제정보
 *  - 제목 : 수열과 구간 쿼리 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181923
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int idx = 0;
        int[] answer = new int[queries.length];
        
        for (int[] query : queries) {
            int s = query[0], e = query[1], k = query[2];
            int min = Integer.MAX_VALUE;
            
            for (int i = s;i <= e;i++)
                if (arr[i] > k)
                    min = Math.min(arr[i], min);
            
            answer[idx++] = min == Integer.MAX_VALUE ? -1 : min;
        }
        
        return answer;
    }
}