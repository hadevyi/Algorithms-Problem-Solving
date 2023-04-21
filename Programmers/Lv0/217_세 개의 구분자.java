/**
 * 1. 문제정보
 *  - 제목 : 세 개의 구분자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181862
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String myStr) {
        for (int i = 0;i < 3;i++)
            myStr = myStr.replace(Character.toString((char)('a' + i)), " ");
        
        StringTokenizer st = new StringTokenizer(myStr);
        int N = st.countTokens();
        if (N == 0) return new String[] {"EMPTY"};
        
        String[] answer = new String[N];
        for (int n = 0;n < N;n++)
            answer[n] = st.nextToken();
        return answer;
    }
}