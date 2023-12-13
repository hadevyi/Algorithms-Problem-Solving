import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : OX퀴즈
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120907
 *  2. 풀이핵심
 *  - 각 수식이 맞는지 판단하기
 * 3. 풀이후기
 *  - 공백을 기준으로 주어졌기에 StringTokenizer를 활용할 수 있었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution(new String[] {"3 - 4 = -3", "5 + 6 = 11"})));
        System.out.println(Arrays.toString(solution(new String[] {"19 - 6 = 13", "5 + 66 = 71", "5 - 15 = 63", "3 - 1 = 2"})));
    }

    public static String[] solution(String[] quiz) {
        int N = quiz.length;
        String[] answer = new String[N];

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(quiz[n]);
            int num1 = Integer.parseInt(st.nextToken());
            String str = st.nextToken();
            int num2 = Integer.parseInt(st.nextToken());
            String equel = st.nextToken();
            int result = Integer.parseInt(st.nextToken());

            switch (str) {
                case "+" :
                    answer[n] = num1 + num2 == result ? "O" : "X";
                    break;
                case "-" :
                    answer[n] = num1 - num2 == result ? "O" : "X";
                    break;
            }
        }

        return answer;
    }
}
