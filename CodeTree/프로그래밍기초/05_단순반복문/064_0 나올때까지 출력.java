import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 0 나올때까지 출력
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-until-zero-is-given/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num == 0) break;
            sb.append(num).append("\n");
        }

        System.out.println(sb.toString());
    }
}