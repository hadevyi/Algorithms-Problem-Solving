import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 완전수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/perfect-number/description
 * 2. 풀이핵심
 *  - n번 반복
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());
        int count = 0;

        for (int num = start;num <= end;num++) {
            if (!isPerfectNumber(num)) continue;
            count++;
        }
        
        System.out.println(count);
    }

    private static boolean isPerfectNumber(int number) {
        int sum = 0;

        for (int num = 1;num < number;num++) {
            if (number % num != 0) continue;
            sum += num;
        }

        return sum == number;
    }
}