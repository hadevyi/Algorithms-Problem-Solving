import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2948. 문자열 교집합
 *  2. 풀이핵심
 *  - Set의 기본적인 풀이 방법
 * 3. 풀이후기
 *  - 근래 푼 문제 중에 제일 간편한 문제
 */
public class Solution {
    public static int T, N, M;
    public static Set<String> set;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            set = new HashSet<>();

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            M = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                set.add(st.nextToken());

            int ANS = 0;
            st = new StringTokenizer(br.readLine());
            for (int m = 0;m < M;m++)
                if (set.contains(st.nextToken()))
                    ANS++;

            sb.append(ANS);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
