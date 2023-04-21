/**
 * 1. 문제정보
 *  - 제목 : 문자열 바꿔서 찾기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181864
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public int solution(String myString, String pat) {
        StringBuffer sb = new StringBuffer();
        for (char ch : myString.toCharArray())
            if (ch == 'A') sb.append('B');
            else sb.append('A');
        return sb.toString().contains(pat) ? 1 : 0;
    }
}