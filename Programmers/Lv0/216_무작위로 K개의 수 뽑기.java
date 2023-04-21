/**
 * 1. 문제정보
 *  - 제목 : 무작위로 K개의 수 뽑기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181858
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr, int k) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (int a : arr)
            if (!arrayList.contains(a))
                arrayList.add(a);
        
        int idx = 0;
        int[] answer = new int[k];
        for (int i = 0;i < k;i++)
            answer[i] = -1;
        for (int i = 0;i < k && i < arrayList.size();i++)
            answer[i] = arrayList.get(i);
        return answer;
    }
}