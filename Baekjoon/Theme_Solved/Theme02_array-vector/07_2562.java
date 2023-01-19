import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 최대값
 *  - 번호 : 2562
 *  - 링크 : https://www.acmicpc.net/problem/2562
 *  2. 풀이핵심
 *  - 반복하면서 최대값 찾기
 * 3. 풀이후기
 *  - string tokenizer를 잘 활용하면 쉽게 사용할 수 있음 (해당이 아니더라도 split으로 동일 진행가능)
 */
public class Main {
    static int MAX, N;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        MAX = Integer.MIN_VALUE;

        for (int i = 1;i <= 9;i++) {
            int num = Integer.parseInt(br.readLine());

            if (MAX < num) {
               MAX = num;
               N = i;
            }
        }

        System.out.println(MAX + "\n" + N);
    }
}