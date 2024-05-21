import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 수 정렬하기 3
 *  - 번호 : 10989
 *  - 링크 : https://www.acmicpc.net/problem/10989
 *  2. 풀이핵심
 *  - 이전 "수 정렬하기 2"의 풀이를 같이 진행됨
 * 3. 풀이후기
 *  - 내용은 간단했기에 고민한 점은 없었음
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        for (int n = 0;n < N;n++)
            arr[n] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        StringBuffer sb = new StringBuffer();
        for (int data : arr)
            sb.append(data).append("\n");
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
