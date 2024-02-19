import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 행과 열
 *  - 링크 : https://www.codetree.ai/missions/4/problems/row-column/description
 * 2. 풀이핵심
 *  - 수학적 규칙에 따라 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < M;m++)
                sb.append((n + 1) * (m + 1)).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}