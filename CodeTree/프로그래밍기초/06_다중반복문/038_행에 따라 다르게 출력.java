import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 행에 따라 다르게 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/output-differently-for-%08row/description
 * 2. 풀이핵심
 *  - 행, 열에 따라 다르게 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        int num = 1, step = 1, count = 1;

        while (count <= N * N) {
            sb.append(num).append(" ");
            num += (count / N) % 2 == 0 ? 1 : 2;
            if (count % N == 0) sb.append("\n");
            count++;
        }

        System.out.println(sb.toString());
    }
}