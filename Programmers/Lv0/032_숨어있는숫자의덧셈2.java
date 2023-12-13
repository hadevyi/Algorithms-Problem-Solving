import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숨어있는 숫자의 덧셈 (2)
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120864
 *  2. 풀이핵심
 *  - 숫자만 계산하기
 * 3. 풀이후기
 *  - 문자를 모두 공백으로 변환해 숫자만 추출해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("aAb1B2cC34oOp"));
        System.out.println(solution("1a2b3c4d123Z"));
    }

    public static int solution(String my_string) {
        int alpha = 'a', ALPHA = 'A';

        for (int i = 0;i < 26;i++) {
            my_string = my_string.replaceAll(Character.toString((char)(alpha + i)), " ");
            my_string = my_string.replaceAll(Character.toString((char)(ALPHA + i)), " ");
        }

        StringTokenizer st = new StringTokenizer(my_string);
        int N = st.countTokens(), answer = 0;

        for (int n = 0;n < N;n++)
            answer += Integer.parseInt(st.nextToken());
        return answer;
    }
}
