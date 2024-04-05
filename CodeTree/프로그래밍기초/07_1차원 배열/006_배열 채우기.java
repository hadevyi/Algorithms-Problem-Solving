import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 채우기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/filling-array/description
 * 2. 풀이핵심
 *  - 한 줄에 여러 개 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new int[N];
        int count = 0;
        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(st.nextToken()); 
            
            if (num == 0) break;
            
            ARR[n] = num;
            count++;
        }

        StringBuffer sb = new StringBuffer();
        for (int n = count - 1;n >= 0;n--)
            sb.append(ARR[n]).append(" ");
        System.out.println(sb.toString());
    }
}