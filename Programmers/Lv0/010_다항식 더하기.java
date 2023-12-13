import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 다항식 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120863
 *  2. 풀이핵심
 *  - 각 항별로 계산하고 출력함
 * 3. 풀이후기
 *  - 출력하는 단계에서 기호의 필요성을 확인하는 단계에서 고민을 했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("3x + 7 + x")); // 4x + 7
        System.out.println(solution("x + x + x")); // 3x
        System.out.println(solution("7 + 8")); // 15
    }

    public static String solution(String polynomial) {
        // 0 < polynomial에 있는 수 < 100

        StringTokenizer st = new StringTokenizer(polynomial);
        int N = st.countTokens();

        int xNumber = 0, number = 0;

        for (int n = 0;n < N;n++) {
            String str = st.nextToken();

            if (str.equals("+")) continue;

            if (str.contains("x")) {
                if (str.length() > 1)
                    xNumber += Integer.parseInt(str.substring(0, str.length() - 1));
                else xNumber ++;
            }
            else
                number += Integer.parseInt(str);
        }

        StringBuffer sb = new StringBuffer();

        sb.append(xNumber == 0 ? "" : xNumber == 1 ? "x" : xNumber + "x");
        sb.append(xNumber == 0 || number == 0 ? "" : " + ");
        sb.append(number == 0 ? "" : number);

        return sb.toString();
    }
}
