import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2070. 큰 놈, 작은 놈, 같은 놈
 *  2. 풀이핵심
 *  - 조건문 확인
 * 3. 풀이후기
 *  - 간단한 문제
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 < num2) sb.append("<");
            else if (num1 > num2) sb.append(">");
            else sb.append("=");

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
