import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 6730. 장애물 경주 난이도
 *  2. 풀이핵심
 *  - 조건에 따른 대소 비교
 * 3. 풀이후기
 *  - 간단하면서도 조금 더 생각해야하는 부분이였음
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                arr[n] = Integer.parseInt(st.nextToken());

            int up = 0, down = 0;

            for (int n = 1;n < N;n++) {
                if (arr[n] > arr[n-1]) {
                    up = Math.max(up, arr[n] - arr[n-1]);
                }
                if (arr[n - 1] > arr[n]) {
                    down = Math.max(down, arr[n - 1] - arr[n]);
                }
            }

            sb.append(up).append(" ").append(down);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
