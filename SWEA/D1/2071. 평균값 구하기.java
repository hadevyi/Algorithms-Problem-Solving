import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2071. 평균값 구하기
 *  2. 풀이핵심
 *  - round 반올림 함수
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
            double ANS = 0;

            for (int i = 0;i < 10;i++)
                ANS += Integer.parseInt(st.nextToken());

            sb.append((int) Math.round(ANS / 10.0));
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
