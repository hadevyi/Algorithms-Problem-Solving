/**
 * 1. 문제정보
 *  - 제목 : 꼬리 문자열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181841
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String[] str_list, String ex) {
        String answer = "";
        for (String str : str_list) {
            if (!str.contains(ex))
                answer += str;
        }
        return answer;
    }
}