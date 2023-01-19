import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 개수
 *  - 번호 : 2577
 *  - 링크 : https://www.acmicpc.net/problem/2577
 *  2. 풀이핵심
 *  - 숫자 연산 결과 빈도수
 * 3. 풀이후기
 *  - 1000보다 작은 세 숫자의 합은 Integer 범위 내로 합산하여 String 변환 후 진행
 */
public class Main {
    static int N = 10;
    static int[] array;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        int RESULT_INT = A*B*C;
        int LEN = Integer.toString(RESULT_INT).length();
        String RESULT_STR = Integer.toString(RESULT_INT);
        array = new int[N];

        for (int len = 0;len < LEN;len++) array[RESULT_STR.charAt(len) - '0']++;
        for (int data : array) sb.append(data).append("\n");

        System.out.println(sb.toString());
    }
}