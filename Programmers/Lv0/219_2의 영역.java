/**
 * 1. 문제정보
 *  - 제목 : 2의 영역
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181894
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
class Solution {
    public int[] solution(int[] arr) {
        int fristIdx = -1, secondIdx = -1;
        for (int i = 0;i < arr.length;i++)
            if (arr[i] == 2 && fristIdx == -1)
                fristIdx = i;
            else if (arr[i] == 2 && fristIdx != -1)
                secondIdx = i;
                
        if (fristIdx == -1 && secondIdx == -1)
            return new int[] {-1};
        else if (fristIdx != -1 && secondIdx == -1)
            return new int[] {2};
        
        int idx = 0;
        int[] answer = new int[secondIdx - fristIdx + 1];
        for (int i = fristIdx;i <= secondIdx;i++)
            answer[idx++] = arr[i];
        return answer;
    }
}