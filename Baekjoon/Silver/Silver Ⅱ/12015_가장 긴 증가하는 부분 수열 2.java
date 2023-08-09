import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 긴 증가하는 부분 수열 2
 *  - 번호 : 12015
 *  - 링크 : https://www.acmicpc.net/problem/12015
 *  2. 풀이핵심
 *  - DP 기록식으로는 불가능하다. 이진탐색을 해야함
 * 3. 풀이후기
 *  - 이진탐색을 하나씩 구현하는 과정이 낯설었지만, 구현했다. 안잊어야할텐데..
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
