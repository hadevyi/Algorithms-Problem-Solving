/**
 * 1. 문제정보
 *  - 제목 : 글자 지우기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181900
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String my_string, int[] indices) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0;i < my_string.length();i++)
            if (!isExist(indices, i))
                sb.append(my_string.charAt(i));
        return sb.toString();
    }
    
    public boolean isExist(int[] array, int value) {
        for (int arr : array)
            if (arr == value)
                return true;
        return false;            
    }
}