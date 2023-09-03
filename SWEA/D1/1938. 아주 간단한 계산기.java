import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1938. 아주 간단한 계산기
 *  2. 풀이핵심
 *  - 사칙연산
 * 3. 풀이후기
 *  - 쉬운 풀이
 */
public class Solution {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int num1 = Integer.parseInt(st.nextToken());
        int num2 = Integer.parseInt(st.nextToken());

        sb.append(num1 + num2).append("\n");
        sb.append(num1 - num2).append("\n");
        sb.append(num1 * num2).append("\n");
        sb.append(num1 / num2);

        System.out.println(sb.toString());
    }
}
