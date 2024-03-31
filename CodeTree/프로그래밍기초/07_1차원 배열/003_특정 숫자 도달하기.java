import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 숫자 도달하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reaching-specific-number/description
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
        StringTokenizer st = new StringTokenizer(br.readLine());

        ARR = new int[N];
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        boolean isOver = false;
        int sum = 0, count = 0;
        for (int n = 0;n < N;n++) {
            int num = ARR[n];
            if (num >= 250) isOver = true;
            if (isOver) continue;
            sum += num;
            count++;
        }
        
        System.out.printf("%d %.1f", sum, (double)sum / count);
    }
}