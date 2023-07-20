import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5431. 민석이의 과제 체크하기
 *  2. 풀이핵심
 *  - 간단한 배열
 * 3. 풀이후기
 *  - index 0를 사용하지 않기에 여유공간 1을 더 사용하여 진행하였다.
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
            int N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            boolean[] isCheck = new boolean[N + 1]; // 0 dummy
            st = new StringTokenizer(br.readLine());

            for (int k = 0;k < K;k++) {
                int num = Integer.parseInt(st.nextToken());
                isCheck[num] = true;
            }

            for (int n = 1;n <= N;n++) {
                if (isCheck[n]) continue;
                sb.append(n).append(" ");
            }
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
