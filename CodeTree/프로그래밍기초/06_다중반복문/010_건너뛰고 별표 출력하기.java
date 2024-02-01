import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 건너뛰고 별표 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/skip-and-print-a-star/description
 * 2. 풀이핵심
 *  - 행 대칭 별찍기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m <= n;m++)
                sb.append("*");
            sb.append("\n").append("\n");
        }

        for (int n = N - 1;n > 0;n--) {
            for (int m = 0;m < n;m++)
                sb.append("*");
            sb.append("\n").append("\n");
        }

        System.out.println(sb.toString());
    }
}