import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 나는 요리사다
 *  - 번호 : 2953
 *  - 링크 : https://www.acmicpc.net/problem/2953
 *  2. 풀이핵심
 *  - 현재 최고 점수의 순번과 결과 출력하기
 * 3. 풀이후기
 *  - 여러번 계산되지 않고 바로 정돈될 수록 하는 것이 핵심으로 생각해 풀었음
 */
public class Main {
    static int MAX, N;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        for (int i = 1;i <= 5;i++) {
            st = new StringTokenizer(br.readLine());

            int sum = 0;
            for (int j = 0;j < 4;j++)
                sum += Integer.parseInt(st.nextToken());

            if (MAX < sum) {
                MAX = sum;
                N = i;
            }
        }

        System.out.println(N + " " + MAX);
    }
}