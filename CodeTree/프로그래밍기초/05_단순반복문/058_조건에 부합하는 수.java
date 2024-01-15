import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 조건에 부합하는 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-that-meets-the-condition/description
 * 2. 풀이핵심
 *  - continue 연습하기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= a;n++) {
            if (n % 2 == 0 && n % 4 != 0) continue;
            if ((n / 8) % 2 == 0) continue;
            if (n % 7 < 4) continue;
            sb.append(n).append(" ");
        }

        System.out.println(sb.toString());
    }
}