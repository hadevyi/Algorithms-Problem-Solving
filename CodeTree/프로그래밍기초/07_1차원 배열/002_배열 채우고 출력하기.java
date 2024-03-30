import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열 채우고 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/filling-array-and-print/description
 * 2. 풀이핵심
 *  - 직사각형 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static String[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        ARR = new String[N];

        for (int n = N - 1;n >= 0;n--)
            ARR[n] = st.nextToken();
        
        for (int n = 0;n < N;n++)
            sb.append(ARR[n]);

        System.out.println(sb.toString());
    }
}