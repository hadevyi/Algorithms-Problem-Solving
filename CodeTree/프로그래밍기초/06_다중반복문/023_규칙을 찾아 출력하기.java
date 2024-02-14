import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 규칙을 찾아 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/find-a-rule-and-print/description
 * 2. 풀이핵심
 *  - 모양과 관계 없는 별 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m < N;m++) {
                if (n == 0 || n == N - 1 || m == 0 || m == N - 1) sb.append("*").append(" ");
                else if (n > m) sb.append("*").append(" ");
                else sb.append(" ").append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}