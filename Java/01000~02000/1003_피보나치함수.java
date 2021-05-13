package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Fibonacci_1003 {

	static int N, NUM;
	static int[][] fibo;
	static StringBuilder sb = new StringBuilder("");

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		for (int n = 1; n <= N; n++) {
			NUM = Integer.parseInt(br.readLine());

			fibo = new int[NUM + 1][2]; // 0 ~ N까지

			fibo[0][0] = 1;
			if (NUM > 0) fibo[1][1] = 1;

			for (int i = 2; i <= NUM; i++) {
				fibo[i][0] = fibo[i - 1][0] + fibo[i - 2][0];
				fibo[i][1] = fibo[i - 1][1] + fibo[i - 2][1];
			}
			
			sb.append(fibo[NUM][0]).append(" ").append(fibo[NUM][1]);
			if (n < N) sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}

}
