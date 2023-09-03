import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2068. 최대수 구하기
 *  2. 풀이핵심
 *  - 최대값 찾기
 * 3. 풀이후기
 *  - 간단한 구현
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

            int MAX = 0, SIZE = st.countTokens();
            for (int size = 0;size < SIZE;size++)
                MAX = Math.max(MAX, Integer.parseInt(st.nextToken()));

            sb.append(MAX);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
