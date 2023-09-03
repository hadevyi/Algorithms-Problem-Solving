import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3431. 준환이의 운동관리
 *  2. 풀이핵심
 *  - 조건 처리하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
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

            int min = Integer.parseInt(st.nextToken());
            int max = Integer.parseInt(st.nextToken());
            int now = Integer.parseInt(st.nextToken());

            if (min <= now && now <= max) sb.append(0);
            else if (now > max) sb.append(-1);
            else sb.append(min - now);

            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
