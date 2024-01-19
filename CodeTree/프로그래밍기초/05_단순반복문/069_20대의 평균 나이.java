import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 20대의 평균 나이
 *  - 링크 : https://www.codetree.ai/missions/4/problems/average-age-of-20/description
 * 2. 풀이핵심
 *  - 무한 루프와 break
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double result = 0, count = 0;

        while (true) {
            int num = Integer.parseInt(br.readLine());
            if (num < 20 || num >= 30) break;
            result += num;
            count++;
        }

        System.out.printf("%.2f", (double) result / count);
    }
}