import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 긴 증가하는 부분 수열 4
 *  - 번호 : 14002
 *  - 링크 : https://www.acmicpc.net/problem/14002
 *  2. 풀이핵심
 *  - LIS를 해야하는데 경로를 출력하려면 이분탐색이 아닌 DP로 정확하게 찾아야한다.
 * 3. 풀이후기
 *  - 상세하게 내용을 확인해야한다면 이분탐색으로 안된다는 것을 알았다.
 */
public class Main {
    public static int N, SIZE;
    public static int[] DP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SIZE = 0;
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(st.nextToken());

        DP = new int[N];
        Arrays.fill(DP, 1);

        for (int n = 0;n < N;n++) {
            for (int m = 0; m < n; m++)
                if (arr[m] < arr[n])
                    DP[n] = Math.max(DP[n], DP[m] + 1);
            SIZE = Math.max(SIZE, DP[n]);
        }

        int count = SIZE, idx = 0;
        int[] result = new int[SIZE];
        for (int num = N - 1;num >= 0;num--) {
            if (DP[num] == count) {
                result[idx++] = arr[num];
                count--;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(SIZE).append("\n");
        for (int n = SIZE - 1;n >= 0;n--)
            sb.append(result[n]).append(" ");
        System.out.println(sb.toString());
    }
}
