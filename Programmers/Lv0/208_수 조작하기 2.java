/**
 * 1. 문제정보
 *  - 제목 : 수 조작하기 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181925
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(int[] numLog) {
        int num = numLog[0];
        StringBuffer sb = new StringBuffer();
        
        for (int i = 1;i < numLog.length;i++) {
            if (numLog[i] - num == 1) sb.append("w");
            else if (numLog[i] - num == -1) sb.append("s");
            else if (numLog[i] - num == 10) sb.append("d");
            else sb.append("a");
            num = numLog[i];
        }
        
        return sb.toString();
    }
}