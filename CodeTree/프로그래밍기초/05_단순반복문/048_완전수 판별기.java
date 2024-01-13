import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 완전수 판별기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/perfect-number-discriminator/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), result = 0;

        for (int n = 1;n < N;n++) {
            if (N % n != 0) continue;
            result += n;
        }

        System.out.println(result == N ? 'P' : 'N');
    }
}