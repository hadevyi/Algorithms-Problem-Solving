/**
 * 1. 문제정보
 *  - 제목 : l로 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181834
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String myString) {
        StringBuffer sb = new StringBuffer();
        for (char ch : myString.toCharArray()) {
            if (ch < 'l') sb.append('l');
            else sb.append(ch);
        }
        return sb.toString();
    }
}