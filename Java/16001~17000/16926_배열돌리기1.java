package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySpan1_16926 {
	static int[][] arr;
	static int N, M, R;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		arr = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				arr[i][j] = Integer.parseInt(st.nextToken());
		}

		for (int i = 0; i < R; i++)
			rotation();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M - 1; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println(arr[i][M - 1]);
		}
	}

	public static void rotation() {
		int[][] temp = new int[N][M];
		int startI = 0, startJ = 0;
		int maxI = N - 1, maxJ = M - 1;

		while (true) {
			if (maxI - startI < 1 || maxJ - startJ < 1)
				break;
			
			for (int j = startJ + 1; j <= maxJ; j++)
				temp[startI][j - 1] = arr[startI][j];

			for (int i = startI + 1; i <= maxI; i++)
				temp[i - 1][maxJ] = arr[i][maxJ];

			for (int j = startJ; j < maxJ; j++)
				temp[maxI][j + 1] = arr[maxI][j];

			for (int i = startJ; i < maxI; i++)
				temp[i + 1][startJ] = arr[i][startJ];

			startI++;
			startJ++;
			maxI--;
			maxJ--;

		}
		arr = temp;
	}
}
