/**
 * 1. 문제정보
 *  - 제목 : 빈 배열에 추가, 삭제하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181860
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int i = 0;i < arr.length;i++)
            if (flag[i])
                for (int n = 0;n < arr[i] * 2;n++)
                    arrayList.add(arr[i]);
            else
                for (int n = 0;n < arr[i];n++)
                    arrayList.remove(arrayList.size() - 1);
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}