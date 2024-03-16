import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 알파벳 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-alphabet/description
 * 2. 풀이핵심
 *  - 알파벳 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), alpha = 'A';
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m <= n;m++) {
                sb.append((char) alpha);
                alpha = alpha + 1 > 'Z' ? 'A' : alpha + 1;
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}