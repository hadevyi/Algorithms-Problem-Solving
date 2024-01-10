import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 홀수만 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-only-odd-numbers/description
 * 2. 풀이핵심
 *  - 조건 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int REAP = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int reap = 0;reap < REAP;reap++) {
            int num = Integer.parseInt(br.readLine());
            if (num % 2 != 0 && num % 3 == 0) sb.append(num).append("\n");
        }

        System.out.println(sb.toString());
    }
}