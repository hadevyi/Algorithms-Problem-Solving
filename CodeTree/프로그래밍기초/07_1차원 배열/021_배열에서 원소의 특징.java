import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열에서 원소의 특징
 *  - 링크 : https://www.codetree.ai/missions/4/problems/characteristics-of-elements-in-an-array/description
 * 2. 풀이핵심
 *  - 인덱스 참조
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
        
        for (int n = 1;n < N;n++) {
            if (ARR[n] % 3 != 0) continue;
            System.out.println(ARR[n - 1]);
            break;
        }
    }
}