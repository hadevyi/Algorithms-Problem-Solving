import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : N M 찍기
 *  - 번호 : 18883
 *  - 링크 : https://www.acmicpc.net/problem/18883
 * 2. 풀이핵심
 *  - for, if문 구현
 * 3. 풀이후기
 *  - 간단한 구현
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 1;i <= N * M;i++) {
            sb.append(i);
            if (i % M != 0) sb.append(" ");
            else if (i % M == 0 && i != N * M) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}