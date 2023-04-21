/**
 * 1. 문제정보
 *  - 제목 : 문자열 섞기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181942
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String str1, String str2) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < str1.length();i++)
            sb.append(str1.charAt(i)).append(str2.charAt(i));
        return sb.toString();
    }
}