/**
 * 1. 문제정보
 *  - 제목 : 숨어있는 숫자의 덧셈 (1)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120851
 *  2. 풀이핵심
 *  - 각 숫자를 파악해 합한느 방법
 * 3. 풀이후기
 *  - ASCII code로 쉽게 활용할 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("aAb1B2cC34oOp")); // 10
        System.out.println(solution("1a2b3c4d123")); // 16
    }

    public static int solution(String my_string) {
        int answer = 0, N = my_string.length();

        for (int n = 0;n < N;n++) {
            char ch = my_string.charAt(n);

            if ('0' <= ch && ch <= '9')
                answer += ch - '0';
        }

        return answer;
    }
}
