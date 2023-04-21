/**
 * 1. 문제정보
 *  - 제목 : 배열 만들기 5
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181912
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        for (String intStr : intStrs) {
            int result = Integer.parseInt(intStr.substring(s, s + l));
            if (result > k)
                arrayList.add(result);
        }
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}