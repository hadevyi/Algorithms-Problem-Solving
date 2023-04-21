/**
 * 1. 문제정보
 *  - 제목 : 콜라츠 수열 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181919
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int n) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        while (n >= 1) {
            arrayList.add(n);
            
            if (n == 1) break;
            
            if (n % 2 == 0)
                n = n / 2;
            else 
                n = 3 * n + 1;
        }
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}