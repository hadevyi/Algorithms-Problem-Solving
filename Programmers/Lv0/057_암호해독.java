/**
 * 1. 문제정보
 *  - 제목 : 암호 해독
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120892
 *  2. 풀이핵심
 *  - code 번째 글자를 출력
 * 3. 풀이후기
 *  - for문의 내용을 활용해 진행함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("dfjardstddetckdaccccdegk", 4)); // attack
        System.out.println(solution("pfqallllabwaoclk", 2)); // fallback
    }

    public static String solution(String cipher, int code) {
        StringBuffer sb = new StringBuffer();
        int N = cipher.length();

        for (int n = code - 1;n < N;n+=code)
            sb.append(cipher.charAt(n));
        return sb.toString();
    }
}
