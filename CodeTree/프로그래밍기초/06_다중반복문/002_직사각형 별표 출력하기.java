import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 직사각형 별표 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-stars-in-rectangle/description
 * 2. 풀이핵심
 *  - 직사각형 출력하기
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
            for (int m = 0;m < M;m++) sb.append("* ");
            sb.append(("\n"));
        }

        System.out.println(sb.toString());
    }
}