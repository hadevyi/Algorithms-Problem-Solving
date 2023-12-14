/**
 * 1. 문제정보
 *  - 제목 : 3진법 뒤집기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/68935
 *  2. 풀이핵심
 *  - 원하는 진법으로 바꾼 후 다시 10진법으로 바꾸는 식
 * 3. 풀이후기
 *  - 각 필요한 구간을 method로 분리하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(45)); // 7
        System.out.println(solution(125)); // 229
    }

    public static int solution(int n) {
        return getTen(getReadThree(n));
    }

    public static int getTen(String str) {
        int result = 0, N = str.length(), P = N - 1;

        for (int n = 0;n < N;n++)
            result += (str.charAt(n) - '0') * Math.pow(3, P--);

        return result;
    }

    public static String getReadThree(int num) {
        StringBuffer sb = new StringBuffer();

        while (num > 0) {
            sb.append(num % 3);
            num = num / 3;
        }

        return sb.toString();
    }
}
