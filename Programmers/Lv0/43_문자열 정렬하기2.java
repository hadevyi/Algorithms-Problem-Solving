/**
 * 1. 문제정보
 *  - 제목 : 문자열 정렬하기2
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120911
 *  2. 풀이핵심
 *  - 대소문자를 구별하고, 그 갯수를 확인하여 순서대로 출력함
 * 3. 풀이후기
 *  - 빈도수를 확인할 수 있는 배열을 통해 1이상의 값을 0이 될때까지 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("Bcad")); // abcd
        System.out.println(solution("heLLo")); // ehllo
        System.out.println(solution("Python")); // hnopty
    }

    public static String solution(String my_string) {
        int N = 26, Len = my_string.length();
        int[] alpha = new int[N];

        for (int len = 0;len < Len;len++) {
            char ch = my_string.charAt(len);

            if ('a' <= ch && ch <= 'z')
                alpha[ch - 'a']++;
            else
                alpha[ch - 'A']++;
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            while (alpha[n]-- > 0)
                sb.append((char)('a' + n));
        return sb.toString();
    }
}
