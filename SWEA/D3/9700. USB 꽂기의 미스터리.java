import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 9700. USB 꽂기의 미스터리
 *  2. 풀이핵심
 *  - 확률식
 * 3. 풀이후기
 *  - 가능한 경우의 수를 생각해서 진행하기
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
            double p = Double.parseDouble(st.nextToken());
            double q = Double.parseDouble(st.nextToken());

            double s1 = (1 - p) * q;        // 1번 뒤집었을 때 USB가 꽂힐 확률
            double s2 = p * (1 - q) * q;    // 2번 뒤집었을 때 USB가 꽂힐 확률

            sb.append(s1 < s2 ? "YES" : "NO");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}