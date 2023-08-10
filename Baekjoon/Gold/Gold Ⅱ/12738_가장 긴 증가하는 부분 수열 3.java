import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 긴 증가하는 부분 수열 3
 *  - 번호 : 12738
 *  - 링크 : https://www.acmicpc.net/problem/12738
 *  2. 풀이핵심
 *  - 직전의 12015번 문제랑 풀이는 다르지 않다.
 * 3. 풀이후기
 *  - 범위가 더 넓어졌음에도 풀이에는 큰 차이가 없다.
 */
public class Main {
    public static int N, IDX;
    public static int[] LIS;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(st.nextToken());

        IDX = 0;
        LIS = new int[N];
        LIS[IDX++] = arr[0];

        for (int i = 1;i < N;i++) {
            if (LIS[IDX - 1] < arr[i]) {
                LIS[IDX++] = arr[i];
            } else {
                int idx = binarySearch(arr[i]);
                LIS[idx] = arr[i];
            }
        }

        System.out.println(IDX);
    }

    public static int binarySearch(int value) {
        int s = 0, e = IDX;
        while (s <= e) {
            int mid = (s + e) / 2;

            if (LIS[mid] == value) return mid;

            if (LIS[mid] >= value) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }
        return s;
    }
}
