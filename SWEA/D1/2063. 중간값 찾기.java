import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2063. 중간값 찾기
 *  2. 풀이핵심
 *  - 정렬하기
 * 3. 풀이후기
 *  - 기존 코드를 활용한 간단한 풀이
 */
public class Solution {

    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ARR = new int[N];

        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(ARR);
        System.out.println(ARR[N / 2]);
    }
}
