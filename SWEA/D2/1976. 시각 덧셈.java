import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1976. 시각 덧셈
 *  2. 풀이핵심
 *  - 표현식으로 풀이
 * 3. 풀이후기
 *  - 시각 계산은 분으로 모두 치환해서 쓰는 것이 편하다.
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
            int min1 = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());
            int min2 = Integer.parseInt(st.nextToken()) * 60 + Integer.parseInt(st.nextToken());

            int totalMin = min1 + min2;

            int hour = (totalMin / 60) % 12;
            hour = hour == 0 ? 12 : hour;
            int min = totalMin % 60;
            sb.append(hour).append(" ").append(min);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
