/**
 * 1. 문제정보
 *  - 제목 : 글자 이어 붙여 문자열 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181915
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String my_string, int[] index_list) {
        StringBuffer sb = new StringBuffer();
        for (int index : index_list)
            sb.append(my_string.charAt(index));
        return sb.toString();
    }
}