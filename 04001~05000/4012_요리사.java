package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Cook_4012 {
	static int T, N, MIN;
	static int[][] Table;
	static int[] A, B;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Cook_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());
			Table = new int[N][N];
			A = new int[N / 2];
			B = new int[N / 2];
			MIN = Integer.MAX_VALUE;

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					Table[i][j] = Integer.parseInt(st.nextToken());
			}

			comb(0, 0);
			System.out.println("#" + t + " " + MIN);
		}
	}

	private static void comb(int cnt, int Idx) {
		if (cnt == N / 2) {
			if (A[0] == 0) {
				setting();
				check();
				//System.out.println(Arrays.toString(A) + " " + Arrays.toString(B));
			}
			return;
		}

		for (int i = Idx; i < N; i++) {
			A[cnt] = i;
			comb(cnt + 1, i + 1);
		}

	}

	private static void check() {
		int Diff = Math.abs(synergy(A) - synergy(B));
		MIN = Math.min(Diff, MIN);
	}

	private static int synergy(int[] arr) {
		int sum = 0, len = arr.length;
		for (int i = 0; i < len; i++)
			for (int j = 0; j < len; j++)
				if (i != j)
					sum += Table[arr[i]][arr[j]];
		return sum;
	}

	private static void setting() {
		int cnt = 0;
		for (int i = 0; i < N; i++)
			if (!isExist(A, i))
				B[cnt++] = i;
	}

	private static boolean isExist(int[] arr, int value) {
		for (int i = 0; i < arr.length; i++)
			if (arr[i] == value)
				return true;
		return false;
	}
}
