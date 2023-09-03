import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1545. 거꾸로 출력해 보아요
 *  2. 풀이핵심
 *  - 반복문 진행
 * 3. 풀이후기
 *  - 간단한 풀이
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = N;n >= 0;n--) {
            sb.append(n);
            if (n > 0) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
