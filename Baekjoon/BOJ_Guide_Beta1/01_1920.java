import java.util.*;
import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 수 찾기
 *  - 번호 : 1920
 *  - 링크 : https://www.acmicpc.net/problem/1920
 *  2. 풀이핵심
 *  - 대상이 되는 정수들과 검사하는 정수들을 별도로 확인하기
 * 3. 풀이후기
 *  - 검사용 함수를 따로 만들어서 진행했음.
 */
public class Main {

    static int N, M;
    static int[] arrNList, arrMList;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arrNList = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++)
            arrNList[n] = Integer.parseInt(st.nextToken());
        Arrays.sort(arrNList);

        M = Integer.parseInt(br.readLine());
        arrMList = new int[M];

        st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        for (int m = 0;m < M;m++)
            sb.append(checkExist(arrNList, N, Integer.parseInt(st.nextToken())) ? 1 : 0).append("\n");

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static boolean checkExist(int[] arr, int N, int data) {
        for (int n = 0;n < N;n++) {
            if (arr[n] == data) return true;
            else if (arr[n] > data) break;
        }
        return false;
    }
}
