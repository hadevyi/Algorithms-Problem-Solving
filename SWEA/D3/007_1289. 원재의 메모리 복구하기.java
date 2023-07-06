import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1289. 원재의 메모리 복구하기
 *  2. 풀이핵심
 *  - 문제 이해
 * 3. 풀이후기
 *  - 이해하면 빠르지만, 이해가 어려운 문제였다. 다시 풀어도 좋을 문제
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            char basic = '0';
            char[] bit = br.readLine().toCharArray();
            int count = 0, N = bit.length;

            for (int n = 0;n < N;n++) {
                if (basic != bit[n]) {
                    count++;
                    basic = bit[n];
                }
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
