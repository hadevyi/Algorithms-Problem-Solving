/**
 * 1. 문제정보
 *  - 제목 : 이진수 더하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/120885
 *  2. 풀이핵심
 *  - 이진수의 합산을 위해 자리수를 맞춰 진행함
 * 3. 풀이후기
 *  - 조금 힘들었지만, 자리수만 맞추니 잘 진행되었음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("10", "01")); // 101
        System.out.println(solution("1001", "1111")); // 11000
    }

    public static String solution(String bin1, String bin2) {
        int N = Math.max(bin1.length(), bin2.length()) + 1;
        int[] bin1Array = new int[N], bin2Array = new int[N];
        int[] upper = new int[N], result = new int[N];
        int bin1N = bin1.length() - 1, bin2N = bin2.length() - 1;

        // 자리수별 배치하기
        for (int b = bin1N, n = N - 1; b >= 0 && n > 0; b--, n--) bin1Array[n] = bin1.charAt(b) - '0';
        for (int b = bin2N, n = N - 1; b >= 0 && n > 0; b--, n--) bin2Array[n] = bin2.charAt(b) - '0';

        // 전체 확인하며, upper와 result 세팅하기
        for (int n = N - 1;n >= 0;n--) {
            int sum = bin1Array[n] + bin2Array[n] + upper[n];

            if (sum == 1) result[n] = 1;
            else if (sum == 2) upper[n - 1] = 1;
            else if (sum == 3) {
                result[n] = 1;
                upper[n - 1] = 1;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int r: result)
            sb.append(r);
        return sb.charAt(0) == '0' ? sb.toString().substring(1) : sb.toString();
    }
}
