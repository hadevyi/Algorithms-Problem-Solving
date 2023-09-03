import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 1933. 간단한 N 의 약수
 *  2. 풀이핵심
 *  - 나머지 연산자
 * 3. 풀이후기
 *  - 나머지 확인하기
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        for (int n = 1;n <= N;n++) {
            if (N % n != 0) continue;
            sb.append(n);
            if (n < N) sb.append(" ");
        }

        System.out.println(sb.toString());
    }
}
