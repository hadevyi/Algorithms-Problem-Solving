import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 5162. 두가지 빵의 딜레마
 *  2. 풀이핵심
 *  - 나누기 연산자
 * 3. 풀이후기
 *  - 종류무관하게 무조건 개수 많이여서 간단한 몫 구하기로 해결하면 된다.
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
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int min = Math.min(A, B);
            sb.append(C / min);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}