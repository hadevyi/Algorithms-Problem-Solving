import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1970. 쉬운 거스름돈
 *  2. 풀이핵심
 *  - 나누기 및 나머지 연산자
 * 3. 풀이후기
 *  - 간단한 연습문제이다.
 */
public class Solution {

    public static int T;
    public static int[] COIN = {50000, 10000, 5000, 1000, 500, 100, 50, 10};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1; t <= T; t++) {
            sb.append("#").append(t).append("\n");
            int money = Integer.parseInt(br.readLine());

            for (int coin : COIN) {
                sb.append(money / coin).append(" ");
                money = money % coin;
            }

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}