import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 약수의 개수가 3개인 수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/square-of-prime-number/description
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
            if (getDivisor(num) != 3) continue;
            count++;
        }

        System.out.println(count);
    }

    private static int getDivisor(int num) {
        int count = 0;
        for (int n = 1;n <= num;n++) {
            if (num % n != 0) continue;
            count++;
        }
        return count;
    }
}