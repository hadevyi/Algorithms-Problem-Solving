import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 14692. 통나무 자르기
 *  2. 풀이핵심
 *  - 짝수 판별
 * 3. 풀이후기
 *  - 모듈러 연산
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
            sb.append(num % 2 == 0 ? "Alice" : "Bob");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}