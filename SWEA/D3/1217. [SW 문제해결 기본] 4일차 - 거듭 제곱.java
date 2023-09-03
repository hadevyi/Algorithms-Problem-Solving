import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1217. [S/W 문제해결 기본] 4일차 - 거듭 제곱
 *  2. 풀이핵심
 *  - 재귀함수 만들기
 * 3. 풀이후기
 *  - 재귀 횟수를 확인하는 것이 중요하였음
 */
public class Solution {

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        for (int t = 0;t < 10;t++) {
            int testCase = Integer.parseInt(br.readLine());
            sb.append("#").append(testCase).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(getResult(N, M - 1, N));
            if (t <= 9) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static int getResult(int N, int M, int Result) {
        if (M == 0) return Result;
        return getResult(N, M - 1, Result * N);
    }
}
