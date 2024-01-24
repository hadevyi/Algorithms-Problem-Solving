import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 합성수 판별기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/factorization-discriminator/description
 * 2. 풀이핵심
 *  - 조건을 만족하는 경우
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        boolean isPrime = false;

        for (int n = 2;n < N;n++) {
            if (N % n == 0) {
                isPrime = true;
                break;
            }
        }

        System.out.println(isPrime ? 'C' : 'N');
    }
}