/**
 * 1. 문제정보
 *  - 제목 : 숫자 문자열과 영단어
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/81301
 *  2. 풀이핵심
 *  - 문자열 치환으로 진행
 * 3. 풀이후기
 *  - replaceAll 함수 활용하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("one4seveneight")); // 1478
        System.out.println(solution("23four5six7")); // 234567
        System.out.println(solution("2three45sixseven")); // 234567
        System.out.println(solution("123")); // 123
    }

    public static String[][] alphaData = new String[][]
            {{"0", "zero"}, {"1", "one"}, {"2", "two"}, {"3", "three"},
            {"4", "four"}, {"5", "five"}, {"6", "six"}, {"7", "seven"},
            {"8", "eight"}, {"9", "nine"}};
    public static int solution(String s) {
        for (String[] alpha : alphaData)
            s = s.replaceAll(alpha[1], alpha[0]);
        return Integer.parseInt(s);
    }
}
