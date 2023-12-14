/**
 * 1. 문제정보
 *  - 제목 : 시저 암호
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12926
 *  2. 풀이핵심
 *  - 범위가 넘어가는 내용 조절하기
 * 3. 풀이후기
 *  - 각 영어 대소문자의 범위가 넘어가면 조정하며 출력함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("AB", 1)); // BC
        System.out.println(solution("z", 1)); // a
        System.out.println(solution("a B z", 4)); // e F d
    }

    public static String solution(String s, int n) {
        StringBuffer sb = new StringBuffer();
        int Len = s.length();

        for (int len = 0;len < Len;len++) {
            char ch = s.charAt(len);

            if (ch == ' ') {
                sb.append(ch);
                continue;
            }

            if ('a' <= ch && ch <= 'z') {
                ch = (char) (ch + n);
                if (ch > 'z')
                    ch = (char)('a' + (ch - 'z' - 1));
            } else {
                ch = (char) (ch + n);
                if (ch > 'Z')
                    ch = (char)('A' + (ch - 'Z' - 1));
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
