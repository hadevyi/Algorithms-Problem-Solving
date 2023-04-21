/**
 * 1. 문제정보
 *  - 제목 : 문자열 곱하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181940
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String my_string, int k) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < k;i++)
            sb.append(my_string);
        return sb.toString();
    }
}