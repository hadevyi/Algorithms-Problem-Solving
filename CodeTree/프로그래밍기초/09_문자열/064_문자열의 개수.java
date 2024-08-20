import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 문자열의 개수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-spring/description
 * 2. 풀이핵심
 *  - 문자열 비교
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int n = 0;
        for (n = 0;;n++) {
            String str = br.readLine();
            if (str.equals("0")) break;
            if (n % 2 == 0) sb.append(str).append("\n");
        }

        System.out.printf("%d\n%s", n, sb.toString());
    }
}