import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 별표 출력하기 6
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-star-6/description
 * 2. 풀이핵심
 *  - 행 열에 대해 대칭인 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) - 1;
        StringBuffer sb = new StringBuffer();

        for (int n = N;n > 0;n--) {
            for (int m = 0;m < N - n;m++) sb.append("  ");
            for (int m = 0;m < n * 2 + 1;m++) sb.append("*").append(" ");
            sb.append("\n");
        }
        
        for (int n = 0;n <= N;n++) {
            for (int m = 0;m < N - n;m++) sb.append("  ");
            for (int m = 0;m < n * 2 + 1;m++) sb.append("*").append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}