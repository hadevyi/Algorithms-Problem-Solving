import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 배열의 곱
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiple-of-two-arrays/description
 * 2. 풀이핵심
 *  - 새로운 2차원 배열의 선언
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 3;
    public static int[][] ARR1, ARR2, MUL;
    public static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    public static void main(String[] args) throws Exception {

        ARR1 = new int[N][N];
        ARR2 = new int[N][N];
        MUL = new int[N][N];

        inputArr(ARR1);
        br.readLine();
        inputArr(ARR2);

        for (int n = 0;n < N;n++) 
            for (int m = 0;m < N;m++) 
                MUL[n][m] = ARR1[n][m] * ARR2[n][m];
        
        System.out.println(printArr(MUL));
    }

    public static void inputArr(int[][] ARR) throws Exception {
        for (int n = 0;n < N;n++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int m = 0;m < N;m++)
                ARR[n][m] = Integer.parseInt(st.nextToken());
        }
    }

    public static String printArr(int[][] ARR) {
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++)
                sb.append(ARR[n][m]).append(" ");
            sb.append("\n");
        }
        return sb.toString();
    }
}