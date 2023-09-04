import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1928. Base64 Decoder
 *  2. 풀이핵심
 *  - 문자열 정리
 * 3. 풀이후기
 *  - 문제 풀이보다 설명이 더 어려웠다.
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            sb.append(decoding(makeBit(br.readLine())));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static String decoding(String bitLine) {
        StringBuffer sb = new StringBuffer();

        for (int s = 0, e = 8;e <= bitLine.length();s += 8, e += 8)
            sb.append((char) changeBitToInteger(bitLine.substring(s, e)));

        return sb.toString();
    }

    public static int changeBitToInteger(String bit) {
        int ANS = 0, pow = (int) Math.pow(2, bit.length() - 1);

        for (int i = 0;i < bit.length();i++) {
            ANS += (bit.charAt(i) - '0') * pow;
            pow = pow / 2;
        }

        return ANS;
    }

    public static String makeBit(String str) {
        StringBuffer sb = new StringBuffer();

        for (char ch : str.toCharArray()) {
            String bit = Integer.toBinaryString(changeIndex(ch));

            for (int i = 0;i < 6 - bit.length();i++)
                sb.append("0");

            sb.append(bit);
        }

        return sb.toString();
    }

    public static int changeIndex(char ch) {
        if ('A' <= ch && ch <= 'Z') return ch - 'A';
        else if ('a' <= ch && ch <= 'z') return 26 + (ch - 'a');
        else if ('0' <= ch && ch <= '9') return 52 + (ch - '0');
        else if (ch == '+') return 62;
        return 63;
    }
}
