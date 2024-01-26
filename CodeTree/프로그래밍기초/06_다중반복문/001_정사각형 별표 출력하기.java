import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 정사각형 별표 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-stars-in-square/description
 * 2. 풀이핵심
 *  - 직사각형 출력하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = 0;i < N;i++) {
            for (int j = 0;j < N;j++) sb.append("*");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}