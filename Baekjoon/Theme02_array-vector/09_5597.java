import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 과제 안 내신 분..?
 *  - 번호 : 5597
 *  - 링크 : https://www.acmicpc.net/problem/5597
 *  2. 풀이핵심
 *  - 범위 잘 확인하기
 * 3. 풀이후기
 *  - 입력받는 횟수와 확인하는 숫자 범위의 수를 잘 확인하면 됨
 */
public class Main {
    static int[] student;
    static int N = 30;
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/boj.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        student = new int[N+1];

        for (int i = 0;i < N - 2;i++) student[Integer.parseInt(br.readLine())]++;
        for (int i = 1;i <= N;i++) if (student[i] == 0) sb.append(i).append("\n");

        System.out.println(sb.deleteCharAt(sb.length()-1));
    }
}