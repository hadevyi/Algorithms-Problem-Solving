import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 몫 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-share/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int count = 0;

        while (true) {
            int num = Integer.parseInt(br.readLine());

            if (num % 2 == 0) {
                sb.append(num / 2).append("\n");
                count++;
            } 

            if (count == 3) break;
        }

        System.out.println(sb.toString());
    }
}