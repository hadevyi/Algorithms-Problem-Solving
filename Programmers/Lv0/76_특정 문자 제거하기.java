/**
 * 1. 문제정보
 *  - 제목 : 특정 문자 제거하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120826
 *  2. 풀이핵심
 *  - 문자열을 구성하는 문자를 확인해 출력
 * 3. 풀이후기
 *  - 해당하지 않을 때만 출력하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("abcdef", "f")); // abcde
        System.out.println(solution("BCBdbe", "B")); // Cdbe
    }

    public static String solution(String my_string, String letter) {
        StringBuffer sb = new StringBuffer();
        int N = my_string.length();

        for (int n = 0;n < N;n++)
            if (!Character.toString(my_string.charAt(n)).equals(letter))
                sb.append(my_string.charAt(n));

        return sb.toString();
    }
}
