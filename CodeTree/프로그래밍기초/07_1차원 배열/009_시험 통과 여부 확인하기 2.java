import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 시험 통과 여부 확인하기 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/verify-test-passed-2/description
 * 2. 풀이핵심
 *  - 한 줄에 여러 개 입력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N, M = 4;
    public static double[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        ARR = new double[N];

        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            double sum = 0;
            for (int m = 0;m < M;m++)
                sum += Integer.parseInt(st.nextToken());
            
            ARR[n] = sum / M;
        }

        int count = 0;
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            double num = ARR[n];
            String result = "";
            
            if (num >= 60) {
                result = "pass";
                count++;
            } else result = "fail";
            
            sb.append(result).append("\n");
        }
        sb.append(count);
        System.out.println(sb.toString());
    }
}