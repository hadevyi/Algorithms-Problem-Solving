import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 범위 안의 수 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-in-range-2/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static int SIZE = 10;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int result = 0, count = 0;

        for (int size = 0;size < SIZE;size++) {
            int num = Integer.parseInt(br.readLine().replaceAll(" ", ""));

            if (num < 0) continue;
            if (num > 200) continue;
            
            count++;
            result += num;
        }

        System.out.printf("%d %.1f", result, (double) result / count);
    }
}