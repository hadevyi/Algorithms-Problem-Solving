/**
 * 1. 문제정보
 *  - 제목 : 세로 읽기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181904
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String solution(String my_string, int m, int c) {
        ArrayList<Character>[] arrayList = new ArrayList[m];
        for (int i = 0;i < m;i++)
            arrayList[i] = new ArrayList<Character>();
        
        for (int i = 0;i < my_string.length();i++) {
            char ch = my_string.charAt(i);
            int idx = i % m;
            arrayList[idx].add(ch);
        }
        
        StringBuffer sb = new StringBuffer();
        for (char data : arrayList[c - 1])
            sb.append(data);
        return sb.toString();
    }
}