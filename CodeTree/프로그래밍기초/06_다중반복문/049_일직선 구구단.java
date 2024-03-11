import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 일직선 구구단
 *  - 링크 : https://www.codetree.ai/missions/4/problems/one-line-multiple/description
 * 2. 풀이핵심
 *  - 포맷에 맞춰 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            for (int m = 1;m <= N;m++)
                sb.append(n).append(" * ").append(m).append(" = ").append(n * m).append("\n");
        }

        System.out.println(sb.toString());
    }
}