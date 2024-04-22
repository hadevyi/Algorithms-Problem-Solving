import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자들의 배수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiple-of-numbers/description
 * 2. 풀이핵심
 *  - 배열 만들기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        ARR = new int[N];
        for (int n = 0;n < N;n++)
            ARR[n] = num * (n + 1);
        
        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            if (ARR[n] % 5 == 0) count++;
            sb.append(ARR[n]).append(" ");
            if (count >= 2) break;
        }

        System.out.println(sb.toString());
    }
}