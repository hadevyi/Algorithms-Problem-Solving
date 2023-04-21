/**
 * 1. 문제정보
 *  - 제목 : 배열의 원소 삭제하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181844
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[] delete_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int a : arr) 
            if (!isExist(delete_list, a))
                arrayList.add(a);
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
    
    public boolean isExist(int[] arr, int data) {
        for (int a : arr)
            if (a == data)
                return true;
        return false;
    }
}