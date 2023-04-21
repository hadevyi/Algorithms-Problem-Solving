/**
 * 1. 문제정보
 *  - 제목 : 배열의 원소만큼 추가하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181861
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int data : arr) {
            for (int i = 0;i < data;i++)
                arrayList.add(data);
        }
        int idx = 0;
        int[] answer = new int[arrayList.size()];
        for (int data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}