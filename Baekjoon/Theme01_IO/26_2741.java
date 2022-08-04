import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : N 찍기
 *  - 번호 : 2741
 *  - 링크 : https://www.acmicpc.net/problem/2741
 * 2. 풀이핵심
 *  - 반복문 확인
 * 3. 풀이후기
 *  - 기초 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0;i < T;i++) {
            sb.append(i + 1);
            if (i < T - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}