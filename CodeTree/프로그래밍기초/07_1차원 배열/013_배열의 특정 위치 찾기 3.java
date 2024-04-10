import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 배열의 특정 위치 찾기 3
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-specific-location-fo-array-3/description
 * 2. 풀이핵심
 *  - 인덱스 참조
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static int[] ARR;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = st.countTokens();

        ARR = new int[N];
        for (int n = 0;n < N;n++)
            ARR[n] = Integer.parseInt(st.nextToken());
        
        int sum = 0;
        for (int n = 0;n < N;n++) {
            if (ARR[n] != 0) continue;
            sum = ARR[n - 1] + ARR[n - 2] + ARR[n - 3];
            break;
        }

        System.out.println(sum);
    }
}