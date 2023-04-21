/**
 * 1. 문제정보
 *  - 제목 : 배열 만들기 6
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181859
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        int i = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (i < arr.length) {
            if (arrayList.size() == 0)
                arrayList.add(arr[i++]);
            else if (arrayList.get(arrayList.size() - 1) == arr[i]) {
                arrayList.remove(arrayList.size() - 1);
                i += 1;
            } else if (arrayList.get(arrayList.size() - 1) != arr[i]) {
                arrayList.add(arr[i]);
                i += 1;
            }
        }
        
        if (arrayList.size() == 0) return new int[] {-1};
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}