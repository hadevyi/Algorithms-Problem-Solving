/**
 * 1. 문제정보
 *  - 제목 : ad 제거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181870
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String[] strArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (String str : strArr)
            if (!str.contains("ad"))
                arrayList.add(str);
        
        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String str : arrayList)
            answer[idx++] = str;
        return answer;
    }
}