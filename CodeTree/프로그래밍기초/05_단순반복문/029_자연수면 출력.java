import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 자연수면 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/output-only-natural-number/description
 * 2. 풀이핵심
 *  - if와 for 활용하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        if (a <= 0) System.out.println(0);
        else {
            StringBuffer sb = new StringBuffer();
            for (int n = 0;n < b;n++)
                sb.append(a);
            System.out.println(sb.toString());
        }
    }
}