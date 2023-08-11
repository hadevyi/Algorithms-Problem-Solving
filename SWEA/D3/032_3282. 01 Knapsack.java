import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3282. 0/1 Knapsack
 *  2. 풀이핵심
 *  - DP의 대표적인 유형
 * 3. 풀이후기
 *  - DP의 테이블을 어떻게 채우는지가 관건이다. 더 연습해야한다.
 */
public class Solution {

    public static int T, N, C;
    public static int[][] DP;
    public static Product[] products;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        T = Integer.parseInt(br.readLine());

        for (int t = 1;t <= T;t++) {
            sb.append("#").append(t).append(" ");

            StringTokenizer st = new StringTokenizer(br.readLine());
            N = Integer.parseInt(st.nextToken());
            C = Integer.parseInt(st.nextToken());
            products = new Product[N + 1];
            DP = new int[N + 1][C + 1];

            for (int n = 1;n <= N;n++) {
                st = new StringTokenizer(br.readLine());
                products[n] = new Product(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
            }

            for (int n = 1;n <= N;n++) {
                Product product = products[n];

                for (int c = 0;c <= C;c++) {
                    if (product.weight > c) {
                        DP[n][c] = DP[n - 1][c];
                    } else {
                        DP[n][c] = Math.max(DP[n-1][c], DP[n-1][c - product.weight] + product.value);
                    }
                }
            }

            sb.append(DP[N][C]);
            if (t < T) sb.append("\n");
        }

        System.out.println(sb.toString());
    }

    public static class Product {
        int weight, value;
        public Product(int weight, int value) {
            this.weight = weight;
            this.value = value;
        }
    }
}
