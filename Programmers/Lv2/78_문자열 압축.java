/**
 * 1. 문제정보
 *  - 제목 : 문자열 압축
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/60057
 *  2. 풀이핵심
 *  - 문자열의 절반까지만 검사하면 되며, 자른 범위 대상 외의 값도 붙여주어야한다.
 * 3. 풀이후기
 *  - 생각보다 어렵지 않았다. 문자열만 조정하면 되어 간단히 수행할 수 있었다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("aabbaccc")); // 7
        System.out.println(solution("ababcdcdababcdcd")); // 9
        System.out.println(solution("abcabcdede")); // 8
        System.out.println(solution("abcabcabcabcdededededede")); // 14
        System.out.println(solution("xababcdcdababcdcd")); // 17
    }

    public static int solution(String s) {
        String result = s;
        int N = s.length(), SIZE = 0;

        while (SIZE <= N / 2) {
            SIZE++;
            StringBuffer sb = new StringBuffer();
            int count = 1, i = 0;
            String lastStr = "";

            for (i = 0;i < N - SIZE + 1;i += SIZE) {
                String now = s.substring(i, i + SIZE);
                if (lastStr.equals(now)) {
                    count++;
                } else {
                    if (count > 1)  sb.append(count);
                    sb.append(lastStr);
                    count = 1;
                    lastStr = now;
                }
            }

            if (count > 1)  sb.append(count);
            sb.append(lastStr);
            if (N % SIZE != 0) sb.append(s.substring(i));
            if (result.length() > sb.toString().length())
                result = sb.toString();
        }

        return result.length();
    }
}
