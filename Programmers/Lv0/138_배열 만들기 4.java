/**
 * 1. 문제정보
 *  - 제목 : 배열 만들기 4
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181918
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        int i = 0;
        while (i < arr.length) {
            if (arrayList.isEmpty()) {
                arrayList.add(arr[i]);
                i += 1;
            } else if (arrayList.get(arrayList.size() - 1) < arr[i]) {
                arrayList.add(arr[i]);
                i += 1;
            } else if (arrayList.get(arrayList.size() - 1) >= arr[i]) {
                arrayList.remove(arrayList.size() - 1);
            }
        }
        int idx = 0;
        int[] stk = new int[arrayList.size()];
        for (int data : arrayList)
            stk[idx++] = data;
        return stk;
    }
}