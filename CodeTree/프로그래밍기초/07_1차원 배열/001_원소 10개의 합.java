import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 원소 10개의 합
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-of-10-elements/description
 * 2. 풀이핵심
 *  - 직사각형 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N = 10;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ARR = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) ARR[n] = Integer.parseInt(st.nextToken());

        int sum = 0;
        for (int num : ARR) sum += num;
        System.out.println(sum);
    }
}