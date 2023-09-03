import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2029. 몫과 나머지 출력하기
 *  2. 풀이핵심
 *  - 간단한 사칙연산
 * 3. 풀이후기
 *  - 어렵지 않은 문제
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

            sb.append(num1 / num2).append(" ").append(num1 % num2);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
