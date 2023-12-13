/**
 * 1. 문제정보
 *  - 제목 : 모음 제거
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120849
 *  2. 풀이핵심
 *  - 조건에 해당 되지 않는 모든 글 출력
 * 3. 풀이후기
 *  - 모음이 5로 갯수가 적어 직접 기재했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("bus")); // bs
        System.out.println(solution("nice to meet you")); // nc t mt y
    }

    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        int N = my_string.length();

        for (int n = 0;n < N;n++)
            if (!(my_string.charAt(n) == 'a' || my_string.charAt(n) == 'e' ||
                    my_string.charAt(n) == 'i' || my_string.charAt(n) == 'o' || my_string.charAt(n) == 'u'))
                sb.append(my_string.charAt(n));

        return sb.toString();
    }
}
