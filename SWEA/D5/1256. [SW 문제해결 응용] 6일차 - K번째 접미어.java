import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1256. [S/W 문제해결 응용] 6일차 - K번째 접미어
 *  2. 풀이핵심
 *  - 간단한 문자열 정리
 * 3. 풀이후기
 *  - 생각보다 어렵지 않게 풀어서 당황했던 문제
 */
public class Solution {

    public static int T, K;
    public static String[] arr;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            K = Integer.parseInt(br.readLine()) - 1;

            String str = br.readLine();
            arr = new String[str.length()];
            for (int n = 0;n < str.length();n++)
                arr[n] = str.substring(n, str.length());

            Arrays.sort(arr);

            sb.append(arr[K]);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
