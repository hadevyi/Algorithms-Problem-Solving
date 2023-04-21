/**
 * 1. 문제정보
 *  - 제목 : 그림 확대
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181836
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String[] picture, int k) {
        StringBuffer sb1 = new StringBuffer(), sb2 = new StringBuffer();;
        String dot = "", x = "";
        for (int i = 0;i < k;i++) {
            sb1.append(".");
            sb2.append("x");
        }
        dot = sb1.toString();
        x = sb2.toString();
        
        int idx = 0;
        String[] answer = new String[picture.length * k];
        for (int i = 0;i < picture.length;i++)    {
            String result = picture[i].replace(".", dot);
            result = result.replace("x", x);
            
            for (int j = 0;j < k;j++)
                answer[idx++] = result;
        }
        return answer;
    }
}