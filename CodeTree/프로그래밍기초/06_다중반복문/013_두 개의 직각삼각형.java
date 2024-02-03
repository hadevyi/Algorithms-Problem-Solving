import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 두 개의 직각삼각형
 *  - 링크 : https://www.codetree.ai/missions/4/problems/two-right-triangle/description
 * 2. 풀이핵심
 *  - 열 대칭 별찍기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = N;n > 0;n--) {
            for (int m = 0;m < n;m++) sb.append("*");
            for (int m = N - n;m < (N - n) * 2;m++) sb.append("  ");
            for (int m = n;m > 0;m--) sb.append("*");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}