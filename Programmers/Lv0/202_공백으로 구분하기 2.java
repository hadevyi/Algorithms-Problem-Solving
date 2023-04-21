/**
 * 1. 문제정보
 *  - 제목 : 공백으로 구분하기 2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/181868
 *  2. 풀이핵심
 *  - 코딩 기초 트레이닝
 * 3. 풀이후기
 *  - 간단한 문제
 */
import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens();
        String[] result = new String[N];
        for (int n = 0;n < N;n++)
            result[n] = st.nextToken();
        return result;
    }
}