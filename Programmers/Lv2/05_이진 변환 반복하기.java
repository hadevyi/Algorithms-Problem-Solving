import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 이진 변환 반복하기
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/70129
 *  2. 풀이핵심
 *  - 문자열로 고치는 단계를 구현하기
 * 3. 풀이후기
 *  - 2진수 변환결과가 역순으로 나오지만, 0과 1의 갯수를 확인하는 거기에 무관했음
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(Arrays.toString(solution("110010101001"))); // [3, 8]
        System.out.println(Arrays.toString(solution("01110"))); // [3, 3]
        System.out.println(Arrays.toString(solution("1111111"))); // [4, 1]
    }

    public static int[] solution(String s) {
        int turnCount = 0, zeroCount = 0;

        while (true) {
            int nowZero = 0;

            for (char ch : s.toCharArray())
                if (ch == '0') nowZero++;

            turnCount++;
            s = getBinaryNumber(s.length() - nowZero);
            zeroCount += nowZero;
            if (s.equals("1")) break;
        }

        return new int[] {turnCount, zeroCount};
    }

    public static String getBinaryNumber(int num) {
        StringBuffer sb = new StringBuffer();

        while (num > 0) {
            sb.append(num%2);
            num = num / 2;
        }

        return sb.toString();
    }
}
