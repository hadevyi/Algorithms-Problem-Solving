import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1945. 간단한 소인수분해
 *  2. 풀이핵심
 *  - 반복문 진행
 * 3. 풀이후기
 *  - 간단한 로직 설계
 */
public class Solution {

    public static int T, N = 5;
    public static int[] COUNT, ARR = {2, 3, 5, 7, 11};
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            COUNT = new int[N];
            int num = Integer.parseInt(br.readLine());

            while (num > 1) {
                int n = 0;
                for (int arr : ARR) {
                    if (num % arr == 0) {
                        n = arr;
                        break;
                    }
                }

                int idx = 0;

                if (n == 3) idx = 1;
                else if (n == 5) idx = 2;
                else if (n == 7) idx = 3;
                else if (n == 11) idx = 4;

                COUNT[idx]++;
                num = num / n;
            }
            for (int n = 0;n < N;n++) {
                sb.append(COUNT[n]);
                if (n < N - 1) sb.append(" ");
            }
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
