import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 입력받은 수의 합과 평균
 *  - 링크 : https://www.codetree.ai/missions/4/problems/sum-and-average-of-the-inputs/description
 * 2. 풀이핵심
 *  - 조건에 대한 총합
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()), result = 0;

        for (int n = 0;n < N;n++) {
            int num = Integer.parseInt(br.readLine().replaceAll(" ", ""));
            result += num;
        }

        System.out.printf("%d %.1f", result, (double) result / N);
    }
}