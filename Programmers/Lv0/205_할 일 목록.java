/**
 * 1. 문제정보
 *  - 제목 : 할 일 목록
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181885
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int i = 0;i < finished.length;i++)
            if (!finished[i])
                arrayList.add(todo_list[i]);
        
        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}