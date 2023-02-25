/**
 * 1. 문제정보
 *  - 제목 : 문자열을 정수로 바꾸기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/12925
 *  2. 풀이핵심
 *  - String의 내용을 확인해 양/음수를 출력하기
 * 3. 풀이후기
 *  - 가장 앞에 음수의 표기가 되어있다면, 음수로 반환함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("1234")); // 1234
        System.out.println(solution("-1234")); // -1234
    }

    public static int solution(String s) {
        return s.charAt(0) != '-' ? Integer.parseInt(s) : -1 * Integer.parseInt(s.substring(1));
    }
}
