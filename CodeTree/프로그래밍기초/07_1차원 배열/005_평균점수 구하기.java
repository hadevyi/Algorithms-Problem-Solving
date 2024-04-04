import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 평균점수 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-average/description
 * 2. 풀이핵심
 *  - 한 줄에 여러 개 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 8;
    public static double[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new double[N];

        for (int n = 0;n < N;n++)
            ARR[n] = Double.parseDouble(st.nextToken());
        
        double sum = 0.0;
        for (int n = 0;n < N;n++)
            sum += ARR[n];

        System.out.printf("%.1f", (double) sum / N);
    }
}