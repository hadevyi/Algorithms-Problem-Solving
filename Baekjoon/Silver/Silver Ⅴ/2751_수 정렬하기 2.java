import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 수 정렬하기
 *  - 번호 : 2751
 *  - 링크 : https://www.acmicpc.net/problem/2751
 *  2. 풀이핵심
 *  - 1000000개의 수 정렬하기
 * 3. 풀이후기
 *  - 이전 문제보다 영역이 넓어졌기에 퀵정렬, 힙정렬로 해봤으나 둘다 시간 초과가 발생했음.
 *  - 이에 따라 기본 Util 함수는 Arrays의 함수를 활용해서 통과했음.
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
        for (int num : arr)
            sb.append(num).append("\n");
        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
