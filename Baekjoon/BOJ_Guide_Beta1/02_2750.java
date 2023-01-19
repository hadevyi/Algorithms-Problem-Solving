import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 수 정렬하기
 *  - 번호 : 2750
 *  - 링크 : https://www.acmicpc.net/problem/2750
 *  2. 풀이핵심
 *  - 1000개의 수 정렬하기
 * 3. 풀이후기
 *  - 가장 효율적이고 스테이블한 선택 정렬을 진행했음.
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(br.readLine());

        selectionSort(arr, N);

        StringBuffer sb = new StringBuffer();
        for (int num : arr)
            sb.append(num).append("\n");
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static void selectionSort(int[] arr, int N) {
        int min, minIdx = 0, temp;
        for (int n = 0;n < N;n++) {
            min = Integer.MAX_VALUE;
            for (int m = n;m < N;m++) {
                if (arr[m] < min) {
                    min = arr[m];
                    minIdx = m;
                }
            }
            temp = arr[n];
            arr[n] = arr[minIdx];
            arr[minIdx] = temp;
        }
    }
}
