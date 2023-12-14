import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : [3차] n진수 게임
 *  - 링크 : https://school.programmers.co.kr/learn/courses/30/lessons/17687
 *  2. 풀이핵심
 *  - N진수로 변환하기
 * 3. 풀이후기
 *  - N진수로 변환하면서, 구할 필요성이 있는 최소만 구해서 진행하는 것을 핵심으로 삼았다.
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        System.out.println(solution(2, 4, 2, 1)); // "0111"
        System.out.println(solution(16, 16, 2, 1)); // "02468ACE11111111"
        System.out.println(solution(16, 16, 2, 2)); // "13579BDF01234567"
    }

    public static String solution(int n, int t, int m, int p) {
        ArrayList<Character> charList = new ArrayList<>();
        StringBuffer sb = new StringBuffer();
        int num = 0;

        while (charList.size() <= m * t)
            for (char ch : getNumber(num++, n).toCharArray())
                charList.add(ch);

        int idx = p - 1;
        for (int reap = 0;reap < t;reap++) {
            sb.append(charList.get(idx));
            idx += m;
        }

        return sb.toString();
    }

    public static String getNumber(int num, int n) {
        if (num == 0) return "0";
        StringBuffer sb = new StringBuffer();

        while (num > 0) {
            int result = num % n;

            if (result < 10) sb.append(result);
            else
                sb.append((char)('A' + (result - 10)));
            num = num / n;
        }
        return sb.reverse().toString();
    }
}
