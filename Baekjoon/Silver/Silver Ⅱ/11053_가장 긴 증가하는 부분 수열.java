import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 긴 증가하는 부분 수열
 *  - 번호 : 11053
 *  - 링크 : https://www.acmicpc.net/problem/11053
 *  2. 풀이핵심
 *  - DP 구현
 * 3. 풀이후기
 *  - 이전까지의 진행 중 값이 작을 때의 최대로 갱신하는 문제. N이 커지면 쓸 수 없다는 문제점이 있음.
 */
public class Main {
    public static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(st.nextToken());

        int result = 0;
        int[] record = new int[N];
        Arrays.fill(record, 1);
        
        for (int n = 0;n < N;n++) {
            for (int m = 0;m < n;m++) {
                if (arr[m] < arr[n]) {
                    record[n] = Math.max(record[n], record[m] + 1);
                }
            }
            result = Math.max(result, record[n]);
        }

        System.out.println(result);
    }
}


