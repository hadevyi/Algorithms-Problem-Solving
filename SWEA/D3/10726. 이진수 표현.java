import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 10726. 이진수 표현
 *  2. 풀이핵심
 *  - 비트 처리하기
 * 3. 풀이후기
 *  - 1로 구성되어있는지 확인하는 간단한 문제
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
            int N = Integer.parseInt(st.nextToken()); // 마지막 N개의 비트
            int M = Integer.parseInt(st.nextToken()); // M의 2진수가 필요함

            boolean isOn = true;
            for (int n = 0;n < N;n++) {
                if ((M & (1 << n)) == 0) {
                    isOn = false;
                    break;
                }
            }

            sb.append(isOn ? "ON" : "OFF");
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
