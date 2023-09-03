import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 12368. 24시간
 * 2. 풀이핵심
 *  - 간단하게 진행한 문제
 * 3. 풀이후기
 *  - 나머지를 고려한 문제
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            sb.append((a + b) % 24);

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
