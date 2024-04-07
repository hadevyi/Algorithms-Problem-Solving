import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 짝수만 거꾸로 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-even-numbers-upside-down/description
 * 2. 풀이핵심
 *  - 한 줄에 여러 개 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ARR = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        StringBuffer sb = new StringBuffer();
        for (int n = N - 1;n >= 0;n--) {
            int num = ARR[n];
            if (num % 2 != 0) continue;
            sb.append(num).append(" ");
        }
        System.out.println(sb.toString());
    }
}