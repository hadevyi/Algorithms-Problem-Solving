package homework;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ArraySpan3_16935 {
	static int N, M, R;
	static int[][] ARR;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());

		ARR = new int[N][M];

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++)
				ARR[i][j] = Integer.parseInt(st.nextToken());
		}

		st = new StringTokenizer(br.readLine());
		int time = st.countTokens();
		for (int i = 0; i <time; i++) {
			switch (Integer.parseInt(st.nextToken())) {

			case 1: // 상하 반전
				UpDown();
				break;
			case 2: // 좌우 반전
				LeftRight();
				break;
			case 3: // 오른쪽 90도 회전
				RightRotation();
				break;
			case 4: // 왼쪽 90도 회전
				LeftRotation();
				break;
			case 5: // 부분 배열을 오른쪽으로 회전 배치
				PartialRight();
				break;
			case 6: // 부분 배열을 왼쪽으로 회전 배치
				PartialLeft();
				break;
			}

		}
		printArray();
	}

	public static void UpDown() {
		for (int i = 0; i < N / 2; i++) {
			int[] temp = ARR[i];
			ARR[i] = ARR[N - (i + 1)];
			ARR[N - (i + 1)] = temp;
		}
	}

	public static void LeftRight() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M / 2; j++) {
				int temp = ARR[i][j];
				ARR[i][j] = ARR[i][M - (j + 1)];
				ARR[i][M - (j + 1)] = temp;
			}
		}
	}

	public static void RightRotation() {
		int[][] result = new int[M][N];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				result[j][N - (i + 1)] = ARR[i][j];

		N = result.length;
		M = result[0].length;
		ARR = result;
	}

	public static void LeftRotation() {

		int[][] result = new int[M][N];

		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				result[M - (j + 1)][i] = ARR[i][j];

		N = result.length;
		M = result[0].length;
		ARR = result;

	}

	public static void PartialRight() {
		int[][] result = new int[N][M];

		for (int i = 0; i < N / 2; i++)
			for (int j = 0; j < M / 2; j++)
				result[i][j + M / 2] = ARR[i][j];

		for (int i = 0; i < N / 2; i++)
			for (int j = M / 2; j < M; j++)
				result[i + N / 2][j] = ARR[i][j];

		for (int i = N / 2; i < N; i++)
			for (int j = M / 2; j < M; j++)
				result[i][j - M / 2] = ARR[i][j];

		for (int i = N / 2; i < N; i++) {
			for (int j = 0; j < M / 2; j++) {
				result[i - N / 2][j] = ARR[i][j];
			}
		}

		ARR = result;
	}

	public static void PartialLeft() {
		int[][] result = new int[N][M];

		for (int i = 0; i < N / 2; i++)
			for (int j = 0; j < M / 2; j++)
				result[i + N / 2][j] = ARR[i][j];

		for (int i = N / 2; i < N; i++)
			for (int j = 0; j < M / 2; j++)
				result[i][j + M / 2] = ARR[i][j];

		for (int i = N / 2; i < N; i++)
			for (int j = M / 2; j < M; j++)
				result[i - N / 2][j] = ARR[i][j];

		for (int i = 0; i < N / 2; i++)
			for (int j = M / 2; j < M; j++)
				result[i][j - M / 2] = ARR[i][j];

		ARR = result;

	}

	public static void printArray() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++)
				System.out.print(ARR[i][j] + " ");
			System.out.println();
		}
	}
}
