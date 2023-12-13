/**
 * 1. 문제정보
 *  - 제목 : 인덱스 바꾸기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120895
 *  2. 풀이핵심
 *  - index swap 해보는 예제
 * 3. 풀이후기
 *  - 간단하며 기본적인 문제
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("hello", 1, 2)); // hlelo
        System.out.println(solution("I love you", 3, 6)); // I l veoyou
    }

    public static String solution(String my_string, int num1, int num2) {
        char[] charList = my_string.toCharArray();

        char temp = charList[num1];
        charList[num1] = charList[num2];
        charList[num2] = temp;

        StringBuffer sb = new StringBuffer();
        for (char ch : charList)
            sb.append(ch);
        return sb.toString();
    }
}
