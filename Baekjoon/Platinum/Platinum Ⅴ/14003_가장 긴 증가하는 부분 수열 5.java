import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 긴 증가하는 부분 수열 5
 *  - 번호 : 14003
 *  - 링크 : https://www.acmicpc.net/problem/14003
 *  2. 풀이핵심
 *  - 드디어 이분탐색 LIS로 경로도 표시하는 방법을 알았다.
 * 3. 풀이후기
 *  - 너무 행복하다. 이게 최적의 방법이다!
 */
public class Main {
    public static int N, SIZE;
    public static int[] LIS, DP;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(st.nextToken());

        SIZE = 0;
        DP = new int[N];
        LIS = new int[N];
        LIS[SIZE++] = arr[0];
        DP[0] = 1;

        for (int n = 1;n < N;n++) {
            if (LIS[SIZE - 1] < arr[n]) {
                LIS[SIZE++] = arr[n];
                DP[n] = SIZE;
            } else {
                int idx = binarySearch(arr[n]);
                LIS[idx] = arr[n];
                DP[n] = idx + 1;
            }
        }

        int count = SIZE;
        List<Integer> list = new ArrayList<>();
        for (int n = N - 1;n >= 0;n--) {
            if (DP[n] == count) {
                list.add(arr[n]);
                count--;
            }
        }

        StringBuffer sb = new StringBuffer();
        sb.append(SIZE).append("\n");
        for (int i = list.size() - 1;i >= 0;i--)
            sb.append(list.get(i)).append(" ");
        System.out.println(sb.toString());
    }

    public static int binarySearch(int value) {
        int s = 0, e = SIZE;

        while (s <= e) {
            int mid = (s + e) / 2;

            if (LIS[mid] == value) return mid;

            if (LIS[mid] < value) {
                s = mid + 1;
            } else {
                e = mid - 1;
            }
        }

        return s;
    }
}
