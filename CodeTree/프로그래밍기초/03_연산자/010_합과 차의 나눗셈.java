import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 합과 차의 나눗셈
 *  - 링크 : https://www.codetree.ai/missions/4/problems/divide-of-sum-and-sub/description
 * 2. 풀이핵심
 *  - 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());
        double result = (a + b) / (a - b);
        System.out.printf("%.2f", Math.round(result * 1000) / 1000.0);
    }
}