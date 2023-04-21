/**
 * 1. 문제정보
 *  - 제목 : 문자열 묶기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181855
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int solution(String[] strArr) {
        Map<Integer, ArrayList<String>> map = new HashMap<>();
        for (String str : strArr) {
            int len = str.length();
            if (map.containsKey(len)) {
                map.get(len).add(str);
            } else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(str);
                map.put(len, temp);
            }
        }
        
        int answer = 0;
        for (int len : map.keySet())
            answer = Math.max(answer, map.get(len).size());
        return answer;
    }
}