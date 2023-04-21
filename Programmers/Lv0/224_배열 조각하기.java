/**
 * 1. 문제정보
 *  - 제목 : 배열 조각하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181893?language=java
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] query) {
        int startIdx = 0, endIdx = arr.length;
        for (int i = 0;i < query.length;i++) {
            int value = query[i];
            if (i % 2 == 0) {
                endIdx = startIdx + value;
            } else {
                startIdx = startIdx + value;
            }
        }
        
        if (startIdx == endIdx) return new int[] {-1};
        int idx = 0;
        int[] answer = new int[endIdx - startIdx];
        for (int i = startIdx;i < endIdx;i++)
            answer[idx++] = arr[i];
        return answer;
    }
}