/**
 * 1. 문제정보
 *  - 제목 : 문자열 뒤집기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120822
 *  2. 풀이핵심
 *  - 문자열을 반대로 출력하기
 * 3. 풀이후기
 *  - 뒤에서부터 앞으로 확인하며 진행하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("jaron")); // noraj
        System.out.println(solution("bread")); // daerb
    }

    public static String solution(String my_string) {
        StringBuffer sb = new StringBuffer();
        int N = my_string.length();
        for (int n = N - 1;n >= 0;n--)
            sb.append(my_string.charAt(n));
        return sb.toString();
    }
}
