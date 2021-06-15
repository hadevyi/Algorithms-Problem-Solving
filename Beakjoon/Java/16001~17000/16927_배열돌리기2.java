package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySpan2_16927 {
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

		rotation();

		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M - 1; j++)
				System.out.print(arr[i][j] + " ");
			System.out.println(arr[i][M - 1]);
		}
	}

	public static void rotation() {
		int startI = 0, startJ = 0;
		int maxI = N - 1, maxJ = M - 1;

		while (true) {
			if (maxI - startI < 1 || maxJ - startJ < 1)
				break;

			int repeat = R % ((maxI - startI) * 2 + (maxJ - startJ) * 2);

			for (int r = 0; r < repeat; r++) {
				int temp = arr[startI][startJ];

				for (int j = startJ + 1; j <= maxJ; j++)
					arr[startI][j - 1] = arr[startI][j];

				for (int i = startI + 1; i <= maxI; i++)
					arr[i - 1][maxJ] = arr[i][maxJ];

				for (int j = maxJ; j > startJ; j--)
					arr[maxI][j] = arr[maxI][j-1];

				for (int i = maxI; i > startI; i--)
					arr[i][startJ] = arr[i-1][startJ];

				arr[startI + 1][startJ] = temp;
			}

			startI++;
			startJ++;
			maxI--;
			maxJ--;

		}
	}
}
