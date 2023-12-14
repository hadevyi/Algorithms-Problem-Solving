/**
 * 1. 문제정보
 *  - 제목 : 신규 아이디 추천
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/72410
 *  2. 풀이핵심
 *  - 문자열을 정리하는 단계별 내용
 * 3. 풀이후기
 *  - 예시만 잘 읽어도 무난함. 단, 단계가 많아서 시간이 많이 소요됨.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm")); // bat.y.abcdefghi
        System.out.println(solution("z-+.^.")); // z--
        System.out.println(solution("=.=")); // aaa
        System.out.println(solution("123_.def")); // 123_.def
        System.out.println(solution("abcdefghijklmn.p")); // abcdefghijklmn
    }

    public static String solution(String new_id) {
        // new_id의 모든 대문자 > 소문자로 치환함
        StringBuffer sb = new StringBuffer();
        for (char ch : new_id.toCharArray())
            sb.append('A' <= ch && ch <= 'Z' ? (char)('a' - 'A' + ch) : ch);
        new_id = sb.toString();

        // 알파벳 소문자, 숫자, 빼기(-), 밑줄(_), 마침표(.)외에 모두 제거
        sb = new StringBuffer();
        for (char ch : new_id.toCharArray())
            if (
                ('a' <= ch && ch <= 'z') ||
                ('0' <= ch && ch <= '9') ||
                (ch == '-') || (ch == '_') || (ch == '.')
            )
                sb.append(ch);
        new_id = sb.toString();

        // 마침표 .이 2번 이상 연속되면 1개로 치환
        sb = new StringBuffer();
        for (int i = 0;i < new_id.length();i++) {
            if (i > 0 && new_id.charAt(i) == '.' && new_id.charAt(i - 1) == '.') continue;
            sb.append(new_id.charAt(i));
        }
        new_id = sb.toString();

        // 마침표 . 가 처음이나 끝에 위치한다면 제거함
        if (new_id.length() > 0 && new_id.charAt(0) == '.')
            new_id = new_id.substring(1);
        if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.')
            new_id = new_id.substring(0, new_id.length() - 1);

        // 빈문자열이면 "a"를 대입
        if (new_id.length() == 0)
            new_id = "a";

        // 16자 이상이면 처음 15글자만 진행
        if (new_id.length() >= 16)
            new_id = new_id.substring(0, 15);

        // 만약, 마침효가 끝에 위치하면 문자 제거
        if (new_id.length() > 0 && new_id.charAt(new_id.length() - 1) == '.')
            new_id = new_id.substring(0, new_id.length() - 1);

        // 2자 이하면, 마지막 글자를 길이 3될 때까지 반복
        if (new_id.length() <= 2) {
            sb = new StringBuffer();
            sb.append(new_id);
            int repeat = 3 - new_id.length();
            for (int i = 0;i < repeat;i++)
                sb.append(new_id.charAt(new_id.length() - 1));
            new_id = sb.toString();
        }

        return new_id;
    }
}
