import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 12221. 구구단2
 *  2. 풀이핵심
 *  - 조건처리
 * 3. 풀이후기
 *  - 간단한 문제
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            if (num1 >= 10 || num2 >= 10)
                sb.append("-1");
            else
                sb.append(num1 * num2);

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
