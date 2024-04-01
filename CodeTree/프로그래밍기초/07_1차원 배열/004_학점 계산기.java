import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 학점 계산기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/credit-calculator/description
 * 2. 풀이핵심
 *  - 직사각형 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static double[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        ARR = new double[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            ARR[n] = Double.parseDouble(st.nextToken());

        double avg = 0;
        for (int n = 0;n < N;n++)
            avg += ARR[n];
        
        avg /= N;

        String result = null;
        if (avg >= 4.0) result = "Perfect";
        else if (avg >= 3.0) result = "Good";
        else result = "Poor";

        System.out.printf("%.1f\n", avg);
        System.out.println(result);
    }
}