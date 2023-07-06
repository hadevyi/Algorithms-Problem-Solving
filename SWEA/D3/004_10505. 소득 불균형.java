import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10505. 소득 불균형
 *  2. 풀이핵심
 *  - 사칙연산
 * 3. 풀이후기
 *  - 간단한 풀이 진행
 */
public class Solution {

    public static int T;
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");
            int avg = 0;
            int N = Integer.parseInt(br.readLine());
            int[] data = new int[N];

            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++) {
                data[n] = Integer.parseInt(st.nextToken());
                avg += data[n];
            }

            avg = avg / N;

            int count = 0;
            for (int n = 0;n < N;n++) {
                if (data[n] <= avg)
                    count++;
            }

            sb.append(count);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
