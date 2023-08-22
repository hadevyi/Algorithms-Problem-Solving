import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5549. 홀수일까 짝수일까
 *  2. 풀이핵심
 *  - MOD 연산
 * 3. 풀이후기
 *  - 숫자 전체를 확인하는 것이 아닌 가장 마지막 자리만 확인하기
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            String num = br.readLine();

            int lastNum = num.charAt(num.length() - 1) - '0';
            sb.append(lastNum % 2 == 0 ? "Even" : "Odd");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
