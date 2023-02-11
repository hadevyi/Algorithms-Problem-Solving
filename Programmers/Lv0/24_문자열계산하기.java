import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 계산하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120902
 *  2. 풀이핵심
 *  - 공백을 기준으로 제공되므로 분리해 진행함
 * 3. 풀이후기
 *  - 연산자가 단순해 쉽게 풀이할 수 있었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("3 + 4"));
    }

    public static int solution(String my_string) {
        StringTokenizer st = new StringTokenizer(my_string);
        int answer = Integer.parseInt(st.nextToken());

        int N = st.countTokens() / 2;
        for (int n = 0;n < N;n++) {
            String str = st.nextToken();
            int num = Integer.parseInt(st.nextToken());
            if (str.equals("+"))  answer += num;
            else answer -= num;
        }

        return answer;
    }
}
