/**
 * 1. 문제정보
 *  - 제목 : 리스트 자르기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181897
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int n, int[] slicer, int[] num_list) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        
        if (n == 1) {
            for (int i = 0;i <= slicer[1];i++)
                arrayList.add(num_list[i]);
        } else if (n == 2) {
            for (int i = slicer[0];i < num_list.length;i++)
                arrayList.add(num_list[i]);
        } else if (n == 3) {
            for (int i = slicer[0];i <= slicer[1];i++)
                arrayList.add(num_list[i]);
        } else {
            for (int i = slicer[0];i <= slicer[1];i+=slicer[2])
                arrayList.add(num_list[i]);
        }
        
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int num : arrayList)
            answer[idx++] = num;
        return answer;
    }
}