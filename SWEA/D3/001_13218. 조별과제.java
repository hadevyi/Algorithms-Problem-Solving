import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 13218. 조별과제
 *  2. 풀이핵심
 *  - 몫 구하기
 * 3. 풀이후기
 *  - D3라고 하기에 너무 쉬웠던 문제였음
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int num = Integer.parseInt(br.readLine());
            sb.append(num / 3);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
