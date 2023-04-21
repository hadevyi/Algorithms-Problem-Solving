/**
 * 1. 문제정보
 *  - 제목 : 문자열 여러 번 뒤집기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181913
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] query : queries) {
            int s = query[0], e = query[1];
            StringBuffer sb = new StringBuffer();
            for (int i = s;i <= e;i++)
                sb.append(my_string.charAt(i));
            my_string = my_string.substring(0, s) + sb.reverse().toString() + my_string.substring(e + 1, my_string.length());
        }
        return my_string;
    }
}