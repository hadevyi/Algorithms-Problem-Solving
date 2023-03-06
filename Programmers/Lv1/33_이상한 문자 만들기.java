/**
 * 1. 문제정보
 *  - 제목 : 이상한 문자 만들기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12930
 *  2. 풀이핵심
 *  - 공백의 위치가 맨앞 혹은 맨뒤가 될 수 있음
 * 3. 풀이후기
 *  - 공백의 위치 제한이 없다는 점을 생각치 못해 오래걸렸음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("try hello world")); // TrY HeLlO WoRlD
        System.out.println(solution(" try hello world ")); //  TrY HeLlO WoRlD
    }

    public static String solution(String s) {
        StringBuffer sb = new StringBuffer();
        int N = s.length(), idx = 0;

        for (int n = 0;n < N;n++) {
            char ch = s.charAt(n);
            if (ch == ' ') {
                idx = 0;
            } else {
                if (idx % 2 == 0 && 'a' <= ch && ch <= 'z') ch = (char)(ch - ('a' - 'A'));
                else if (idx % 2 == 1 && 'A' <= ch && ch <= 'Z') ch = (char)(ch + ('a' - 'A'));
                idx++;
            }
            sb.append(ch);
        }

        return sb.toString();
    }
}
