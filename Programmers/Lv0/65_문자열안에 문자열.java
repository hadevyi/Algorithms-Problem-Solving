/**
 * 1. 문제정보
 *  - 제목 : 문자열안에 문자열
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120908
 *  2. 풀이핵심
 *  - String Method를 활용함
 * 3. 풀이후기
 *  - 간단한 한줄로 진행할 수 있음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("ab6CDE443fgh22iJKlmn1o", "6CD")); // 1
        System.out.println(solution("ppprrrogrammers", "pppp")); // 2
        System.out.println(solution("AbcAbcA", "AAA")); // 2
    }

    public static int solution(String str1, String str2) {
        return str1.contains(str2) ? 1 : 2;
    }
}
