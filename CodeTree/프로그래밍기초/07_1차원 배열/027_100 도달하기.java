import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 100 도달하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reach-100/description
 * 2. 풀이핵심
 *  - 배열 만들기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        N = 100;
        ARR = new int[N];
        ARR[0] = 1;
        ARR[1] = num;

        for (int n = 2;n < N;n++) {
            ARR[n] = ARR[n - 1] + ARR[n - 2];
            if (ARR[n] > 100) {
                N = n + 1;
                break;
            }
        }

        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++)
            sb.append(ARR[n]).append(" ");
        System.out.println(sb.toString());
    }
}