/**
 * 1. 문제정보
 *  - 제목 : 한 번만 등장한 문자
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120896
 *  2. 풀이핵심
 *  - 문자열의 상세를 카운딩해 정확히 1인 경우만 출력함
 * 3. 풀이후기
 *  - 빈도수를 확인하는 간단한 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("abcabcadc")); // d
        System.out.println(solution("abdc")); // abcd
        System.out.println(solution("hello")); // eho
    }

    public static String solution(String s) {
        int N = 26;
        int[] alpha = new int[N];

        for (int i = 0;i < s.length();i++)
            alpha[s.charAt(i) - 'a']++;

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            if(alpha[n] == 1)
                sb.append((char)('a' + n));

        return sb.toString();
    }
}
