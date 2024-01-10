import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 2 또는 3의 배수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiple-of-2-or-3/description
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

        for (int n = 1;n <= N;n++)
            sb.append(n % 2 == 0 || n % 3 == 0 ? 1 : 0).append(" ");

        System.out.println(sb.toString());
    }
}