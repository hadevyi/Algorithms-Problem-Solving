import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열의 특정 위치 찾기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-specific-location-fo-array/description
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

        int eventSum = 0, threeSum = 0, threeCount = 0;
        for (int n = 0;n < N;n++) {
            int num = ARR[n];
            if (n % 2 != 0) eventSum += num;
            if ((n + 1) % 3 == 0) {
                threeCount++;
                threeSum += num;
            }
        }

        System.out.printf("%d %.1f", eventSum, (double) threeSum / (double) threeCount);
    }
}