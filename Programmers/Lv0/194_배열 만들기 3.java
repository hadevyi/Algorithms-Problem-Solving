/**
 * 1. 문제정보
 *  - 제목 : 배열 만들기 3
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181895
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int[] interval : intervals) {
            for (int i = interval[0];i <= interval[1];i++)
                arrayList.add(arr[i]);
        }
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}