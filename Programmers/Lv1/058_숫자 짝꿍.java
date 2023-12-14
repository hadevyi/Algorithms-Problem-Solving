/**
 * 1. 문제정보
 *  - 제목 : 숫자 짝꿍
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/131128
 *  2. 풀이핵심
 *  - 둘다 있어야하고, 짝이 맞아야함
 * 3. 풀이후기
 *  - 각각의 수를 확인하고, 둘 다 존재하는 경우 짝의 수만큼만 진행 
 *  - 진행은 쉬웠고, 결과 출력 구별에서 잘 확인해야 함
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution("100", "2345")); // -1
        System.out.println(solution("100", "203045")); // 0
        System.out.println(solution("100", "123450")); // 10
        System.out.println(solution("12321", "42531")); // 321
        System.out.println(solution("5525", "1255")); // 552
    }

    public static String solution(String X, String Y) {
        int[] numXCount = new int[10];
        int[] numYCount = new int[10];

        for (char ch : X.toCharArray()) numXCount[ch - '0']++;
        for (char ch : Y.toCharArray()) numYCount[ch - '0']++;

        StringBuffer sb = new StringBuffer();
        for (int i = 9;i >= 0;i--)
            if (numXCount[i] > 0 && numYCount[i] > 0) {
                int repeat = 0;
                if (numXCount[i] == numYCount[i]) repeat = numYCount[i];
                else repeat = Math.min(numXCount[i], numYCount[i]);
                for (int r = 0;r < repeat;r++)
                    sb.append(i);
            }

        if (sb.length() == 0) return "-1";
        for (char data : sb.toString().toCharArray())
            if ((data - '0') != 0)
                return sb.toString();
        return "0";
    }
}
