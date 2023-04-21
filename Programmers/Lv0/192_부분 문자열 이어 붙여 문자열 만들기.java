/**
 * 1. 문제정보
 *  - 제목 : 부분 문자열 이어 붙여 문자열 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181911
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < parts.length;i++) {
            int s = parts[i][0], e = parts[i][1];
            sb.append(my_strings[i].substring(s, e + 1));
        }
        return sb.toString();
    }
}