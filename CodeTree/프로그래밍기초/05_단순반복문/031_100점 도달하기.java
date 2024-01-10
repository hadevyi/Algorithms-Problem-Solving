import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 100점 도달하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/reach-100-point/description
 * 2. 풀이핵심
 *  - 조건 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = N;n <= 100;n++) {
            char ch = ' ';

            if (90 <= n) ch = 'A';
            else if (80 <= n) ch = 'B';
            else if (70 <= n) ch = 'C';
            else if (60 <= n) ch = 'D';
            else ch = 'F';

            sb.append(ch).append(" ");
        }

        System.out.println(sb.toString());
    }
}