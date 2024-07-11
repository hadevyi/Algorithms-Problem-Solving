import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열 나누기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/divide-string/description
 * 2. 풀이핵심
 *  - 문자열 concat
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int N;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());

        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int n = 0;n < N;n++) sb.append(st.nextToken());
        String str = sb.toString();

        sb = new StringBuffer();
        for (int n = 0;n < str.length();n += 5) sb.append(str.substring(n, Math.min(n + 5, str.length()))).append("\n");
        System.out.println(sb.toString());
    }
}