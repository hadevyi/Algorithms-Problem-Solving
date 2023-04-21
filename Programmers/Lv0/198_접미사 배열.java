/**
 * 1. 문제정보
 *  - 제목 : 접미사 배열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181909
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        int n = my_string.length();
        ArrayList<String> arrayList = new ArrayList<>();
        
        for (int i = my_string.length() - 1;i >= 0;i--) {
            String subStr = my_string.substring(i, n);
            if (!arrayList.contains(subStr));
                arrayList.add(subStr);
        }
        
        Collections.sort(arrayList);
        int idx = 0;
        String[] answer = new String[arrayList.size()];
        for (String data : arrayList)
            answer[idx++] = data;
        return answer;
    }
}