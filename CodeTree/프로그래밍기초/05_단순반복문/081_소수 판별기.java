import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소수 판별기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/prime-number-discriminator/description
 * 2. 풀이핵심
 *  - 조건 충족 확인
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()); 
        boolean isPrime = true;

        for (int n = 2;n < N;n++) {
            if (N % n == 0) {
                isPrime = false;
                break;
            }
        }

        System.out.println(isPrime ? 'P' : 'C');
    }
}