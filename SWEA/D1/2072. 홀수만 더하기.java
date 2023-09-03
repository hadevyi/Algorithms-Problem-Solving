import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2072. 홀수만 더하기
 *  2. 풀이핵심
 *  - 반복문 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
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
            int SIZE = st.countTokens(), ANS = 0;

            for (int size = 0;size < SIZE;size++) {
                int num = Integer.parseInt(st.nextToken());
                if (num % 2 == 1) ANS += num;
            }

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
