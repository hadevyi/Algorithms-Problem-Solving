import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1288. 새로운 불면증 치료법
 *  2. 풀이핵심
 *  - 0~9까지의 체킹
 * 3. 풀이후기
 *  - N의 범위가 10^6이기에 직접 연산하기보다는 2진수로 체크하면 좋다.
 */
public class Solution {

    public static int T, BIT;
    public static int MAX = (1 << 10) - 1;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int N = Integer.parseInt(br.readLine());
            int result = 0;
            BIT = 0;

            for (int i = 1;;i++) {
                result = N * i;

                for (char ch : Integer.toString(result).toCharArray())
                    BIT = BIT | (1 << (ch - '0'));

                if (BIT == MAX) break;
            }

            sb.append(result);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}