import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 1, 2, 3더하기
 *  - 번호 : 9095
 *  - 링크 : https://www.acmicpc.net/problem/9095
 *  2. 풀이핵심
 *  - 특정 변화의 규칙을 찾아 배치함
 * 3. 풀이후기
 *  - n의 범위가 적어 미리 계산, 배치 후 출력만 진행함.
 */
public class Main {

    public static int T, N;
    public static int[] data;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        data = new int[11]; // n은 양수이며 11미만, 0은 dummy

        setData();
        System.out.println(Arrays.toString(data));

        for (int t = 0;t < T;t++) {
            N = Integer.parseInt(br.readLine());
            sb.append(data[N]).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }

    private static void setData() {
        data[1] = 1; // 1
        data[2] = 2; // 1 + 1       2
        data[3] = 4; // 1 + 1 + 1   1 + 2   2 + 1   3
        for (int i = 4;i < 11;i++) {
            data[i] = data[i - 3] + data[i - 2] + data[i - 1];
        }
    }
}
