package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class PascalTriangle_2005 {
	static int T, N;
	static int[][] number;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/PascalInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder("");
			sb.append("#").append(t).append("\n");

			N = Integer.parseInt(br.readLine());
			number = new int[N][N];
			clear();
			setting();

			for (int i = 0; i < N; i++) {
				for (int j = 0; j <= i; j++) {
					sb.append(number[i][j]);

					if (j != i)
						sb.append(" ");
					else
						sb.append("\n");
				}
			}
			
			System.out.print(sb.toString());
		}
	}

	private static void setting() {
		for (int i = 1; i < N; i++)
			for (int j = 1; j <= i; j++)
				number[i][j] = number[i - 1][j - 1] + number[i - 1][j];
	}

	private static void clear() {
		for (int i = 0; i < N; i++)
			for (int j = 0; j <= i; j++)
				if (j == 0)
					number[i][j] = 1;
				else
					number[i][j] = 0;
	}
}
