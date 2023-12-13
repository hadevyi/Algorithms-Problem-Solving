/**
 * 1. 문제정보
 *  - 제목 : 문자 반복 출력하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120825
 *  2. 풀이핵심
 *  - 순서대로 확인하며 반복함
 * 3. 풀이후기
 *  - 이중포문이면 쉬웠음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("hello", 3)); // hhheeellllllooo
    }

    public static String solution(String my_string, int n) {
        StringBuffer sb = new StringBuffer();
        int I = my_string.length();
        for (int i = 0;i < I;i++)
            for (int j = 0;j < n;j++)
                sb.append(my_string.charAt(i));
        return sb.toString();
    }
}
