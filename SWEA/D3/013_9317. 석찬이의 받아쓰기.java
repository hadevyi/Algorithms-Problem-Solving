import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 9317. 석찬이의 받아쓰기
 *  2. 풀이핵심
 *  - String to Char Array
 * 3. 풀이후기
 *  - 단순 비교
 */
public class Solution {
    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int N = Integer.parseInt(br.readLine());
            char[] origin = br.readLine().toCharArray();
            char[] check = br.readLine().toCharArray();

            int count = 0;
            for (int n = 0;n < N;n++) {
                if (origin[n] == check[n])
                    count++;
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
