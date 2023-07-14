import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 11688. Calkin-Wilf tree 1
 *  2. 풀이핵심
 *  - 조건에 따른 중첩 계산
 * 3. 풀이후기
 *  - 복잡해보이지만 간단한 수식
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int up = 1, down = 1;

            char[] chList = br.readLine().toCharArray();
            int N = chList.length;

            for (int n = 0;n < N;n++) {
                char now = chList[n];

                if (now == 'L') {
                    down = up + down;
                } else {
                    up = up + down;
                }
            }

            sb.append(up).append(" ").append(down);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
