/**
 * 1. 문제정보
 *  - 제목 : 코드 처리하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181932
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String code) {
        int mode = 0;
        StringBuffer sb = new StringBuffer();
        
        for (int idx = 0;idx < code.length();idx++) {
            char ch = code.charAt(idx);
            if (mode == 0) {
                if (ch == '1') mode = mode == 0 ? 1 : 0;
                else if (ch != '1' && idx % 2 == 0)
                    sb.append(ch);
            } else {
                if (ch == '1') mode = mode == 1 ? 0 : 1;
                else if (ch != '1' && idx % 2 == 1)
                    sb.append(ch);
            }
        }
        
        return sb.toString().length() == 0 ? "EMPTY" : sb.toString();
    }
}