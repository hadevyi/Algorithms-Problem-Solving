import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 특정 조건의 온전수 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-onjeonsu/description
 * 2. 풀이핵심
 *  - continue 연습하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            if (n % 2 == 0) continue;
            if (n % 10 == 5) continue;
            if (n % 3 == 0 && n % 9 != 0) continue;
            sb.append(n).append(" ");
        }

        System.out.println(sb.toString());
    }
}