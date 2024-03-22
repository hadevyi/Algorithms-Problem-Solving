import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 소수 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/get-prime/description
 * 2. 풀이핵심
 *  - n번 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int n = 1;n <= N;n++) {
            if (!isPrime(n)) continue;
            sb.append(n).append(" ");
        }

        System.out.println(sb.toString());
    }

    private static boolean isPrime(int number) {
        if (number == 1) return false;
        for (int num = 2;num <= Math.sqrt(number);num++)
            if (number % num == 0) return false;
        return true;
    }
}