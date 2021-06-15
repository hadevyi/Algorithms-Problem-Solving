package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sum_1209 {
	static int T = 10, N = 100;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/SumInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= T; t++) {
			int testCase = Integer.parseInt(br.readLine());

			arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}

			int MAX = Math.max(Math.max(rowMax(), colMax()), crossMax());
			
			System.out.println("#" + t + " " + MAX);
		}
	}

	private static int crossMax() {
		int sum1 = 0;
		for (int n = 0; n < N; n++)
			sum1 += arr[n][n];

		int i = 0, j = N - 1, sum2 = 0;
		for (int n = 0; n < N; n++)
			sum2 += arr[i++][j--];

		return Math.max(sum1, sum2);
	}

	private static int colMax() {
		int max = 0;

		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++)
				sum += arr[j][i];
			max = Math.max(max, sum);
		}

		return max;
	}

	private static int rowMax() {
		int max = 0;

		for (int i = 0; i < N; i++) {
			int sum = 0;
			for (int j = 0; j < N; j++)
				sum += arr[i][j];
			max = Math.max(max, sum);
		}

		return max;
	}
}
