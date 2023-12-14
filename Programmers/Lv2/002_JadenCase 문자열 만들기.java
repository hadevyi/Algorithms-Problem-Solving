/**
 * 1. 문제정보
 *  - 제목 : JadenCase 문자열 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12951
 *  2. 풀이핵심
 *  - 문자열 처리하기
 * 3. 풀이후기
 *  - 공백이 여러개 나올 수 있다는 조건을 구현해서 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("3people unFollowed me")); // 3people Unfollowed Me
        System.out.println(solution("for the last week")); // For The Last Week
    }

    public static String solution(String s) {
        StringBuffer sb = new StringBuffer();

        for (int i = 0;i < s.length();i++) {
            char now_char = s.charAt(i);

            if (now_char == ' ') {
                sb.append(now_char);
            } else if ('0' <= now_char && now_char <= '9') {
                sb.append(now_char);
            } else if (i == 0 && 'a' <= now_char && now_char <= 'z') {
                sb.append((char)('A' + (now_char - 'a')));
            } else if (i > 0 && s.charAt(i - 1) == ' '
                    && 'a' <= now_char && now_char <= 'z') {
                sb.append((char)('A' + (now_char - 'a')));
            } else if (i > 0 && s.charAt(i - 1) != ' '
                    && 'A' <= now_char && now_char <= 'Z') {
                sb.append((char)('a' + (now_char - 'A')));
            } else sb.append(now_char);
        }

        return sb.toString();
    }
}
