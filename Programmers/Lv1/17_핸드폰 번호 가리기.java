/**
 * 1. 문제정보
 *  - 제목 : 핸드폰 번호 가리기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12948
 *  2. 풀이핵심
 *  - 뒤에서부터 4개만 제대로 출력
 * 3. 풀이후기
 *  - 반복문과 조건문으로 간단히 구현
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("01033334444")); // *******4444
        System.out.println(solution("027778888")); // *****8888
    }

    public static String solution(String phone_number) {
        StringBuffer sb = new StringBuffer();
        int N = phone_number.length();

        for (int n = 0;n < N;n++) {
            if (n < N - 4) sb.append("*");
            else sb.append(phone_number.charAt(n));
        }

        return sb.toString();
    }
}
