import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 보물
 *  - 번호 : 1026
 *  - 링크 : https://www.acmicpc.net/problem/1026
 *  2. 풀이핵심
 *  - A의 작은 순대로 B의 큰 순대로 곱하면 최소값이 나옴
 * 3. 풀이후기
 *  - Arrays의 sort를 활용해 오름차순/내림차순을 직접 사용해본 것이 오랜만이였음
 */
public class Main {

    static int N, RESULT;
    static Integer[] arrA, arrB;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        N = Integer.parseInt(br.readLine());
        arrA = new Integer[N];
        arrB = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) arrA[n] = Integer.parseInt(st.nextToken());
        st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) arrB[n] = Integer.parseInt(st.nextToken());

        Arrays.sort(arrA);
        Arrays.sort(arrB, Comparator.reverseOrder());

        for (int n = 0;n < N;n++)
            RESULT += arrA[n] * arrB[n];

        System.out.println(RESULT);
    }
}
