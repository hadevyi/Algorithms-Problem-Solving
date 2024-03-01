import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정상적인 구구단
 *  - 링크 : https://www.codetree.ai/missions/4/problems/normal-multiple/description
 * 2. 풀이핵심
 *  - 구구단
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            for (int m = 1;m <= N;m++) {
                sb.append(n).append(" * ").append(m).append(" = ").append(n*m);
                if (m < N) sb.append(", ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}