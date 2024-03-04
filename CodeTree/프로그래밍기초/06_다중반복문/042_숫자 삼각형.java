import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자 삼각형
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-triangle/description
 * 2. 풀이핵심
 *  - 모양대로 숫자 출력
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 0;n < N;n++) {
            for (int m = 0;m <= n;m++)
                sb.append(m + 1).append(" ");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}