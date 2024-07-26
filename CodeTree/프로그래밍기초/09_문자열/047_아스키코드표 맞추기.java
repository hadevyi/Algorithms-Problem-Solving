import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 아스키코드표 맞추기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/chart-of-ASCII/description
 * 2. 풀이핵심
 *  - 아스키 코드
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();
        int N = st.countTokens();

        for (int n = 0;n < N;n++) {
            int asciiCode = Integer.parseInt(st.nextToken());
            sb.append((char) asciiCode).append(" ");
        }

        System.out.println(sb.toString());
    }
}