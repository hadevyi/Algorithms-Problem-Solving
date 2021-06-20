package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberSort_1996 {
	static int T, N;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/SortInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringBuilder sb = new StringBuilder("");
			sb.append("#").append(t).append(" ");

			N = Integer.parseInt(br.readLine());
			arr = new int[N];
			StringTokenizer st = new StringTokenizer(br.readLine());

			for (int n = 0; n < N; n++)
				arr[n] = Integer.parseInt(st.nextToken());

			sort();

			for (int n = 0; n < N; n++) {
				sb.append(arr[n]);
				if (n != N - 1)
					sb.append(" ");
			}
			
			System.out.println(sb.toString());
		}
	}

	private static void sort() {
		for (int tryCnt = 0; tryCnt < N - 1; tryCnt++) {
			for (int i = 0; i < N - 1; i++) {
				if (arr[i] > arr[i + 1]) {
					int temp = arr[i];
					arr[i] = arr[i + 1];
					arr[i + 1] = temp;
				}
			}
		}
	}
}
