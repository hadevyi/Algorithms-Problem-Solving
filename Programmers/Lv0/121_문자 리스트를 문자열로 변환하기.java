/**
 * 1. 문제정보
 *  - 제목 : 문자 리스트를 문자열로 변환하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181941
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String[] arr) {
        StringBuffer sb = new StringBuffer();
        for (String a : arr)
            sb.append(a);
        return sb.toString();
    }
}