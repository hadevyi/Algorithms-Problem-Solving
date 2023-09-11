import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1966. 숫자를 정렬하자
 *  2. 풀이핵심
 *  - 기본 함수 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Solution {

    public static int T, N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            N = Integer.parseInt(br.readLine());
            int[] ARR = new int[N];
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int n = 0;n < N;n++)
                ARR[n] = Integer.parseInt(st.nextToken());
            Arrays.sort(ARR);

            for (int data : ARR)
                sb.append(data).append(" ");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
