import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 최소, 최대
 *  - 번호 : 10818
 *  - 링크 : https://www.acmicpc.net/problem/10818
 *  2. 풀이핵심
 *  - 입력된 갯수만큼 반복하면서 최소, 최대값 찾기
 * 3. 풀이후기
 *  - string tokenizer를 잘 활용하면 쉽게 사용할 수 있음 (해당이 아니더라도 split으로 동일 진행가능)
 */
public class Main {
    static int MAX, MIN;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MAX = Integer.MIN_VALUE;
        MIN = Integer.MAX_VALUE;

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0;i < N;i++) {
            int num = Integer.parseInt(st.nextToken());

            MAX = MAX < num ? num : MAX;
            MIN = MIN > num ? num : MIN;
        }

        System.out.println(MIN + " " + MAX);
    }
}