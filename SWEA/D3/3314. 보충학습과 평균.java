import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3314. 보충학습과 평균
 *  2. 풀이핵심
 *  - 반복문과 조건문
 * 3. 풀이후기
 *  - 간단 구현
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
            int result = 0;

            for (int n = 0;n < 5;n++) {
                int num = Integer.parseInt(st.nextToken());
                result += num >= 40 ? num : 40;
            }

            sb.append(result/5);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
