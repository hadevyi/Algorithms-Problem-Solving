import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : a 부터 b 까지
 *  - 링크 : https://www.codetree.ai/missions/4/problems/a-to-b/description
 * 2. 풀이핵심
 *  - 조건 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuffer sb = new StringBuffer();

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        while (a <= b) {
            sb.append(a).append(" ");
            a = a % 2 == 0 ? a + 3 : a * 2;
        }

        System.out.println(sb.toString());
    }
}