package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Sudoku_1974 {
	static int T, N = 9;
	static boolean valid;
	static boolean[] check;
	static int[][] MAP = new int[N][N];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Sudoku_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			check = new boolean[N + 1]; // 0은 dummy
			valid = true;

			// 값 입력
			for (int i = 0; i < N; i++) {
				String input = br.readLine();
				StringTokenizer st = new StringTokenizer(input, " ");
				for (int j = 0; j < N; j++) {
					MAP[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 행-열 검사
			for (int i = 0; i < N; i++) {
				if (rowCheck(i) == false || colCheck(i) == false) {
					valid = false;
					break; // 이후는 검사할 필요없음
				}
			}

			// 정사각형 검사 - 행열 검사를 통과했을 때만
			if (valid) {

				for (int i = 0; i < N; i += 3) {
					for (int j = 0; j < N; j += 3) {
						if (!rectCheck(i, j)) { // 통과 ture, 아니면 fasle
							valid = false;
							break; // 이후는 검사할 필요없음
						}
					}
					if(!valid) break;
				}
			}

			// 결과 출력
			System.out.print("#" + oneCase + " ");
			if (valid)
				System.out.println("1");
			else
				System.out.println("0");
		}

	}

	public static void checkClear() {
		for (int i = 0; i <= N; i++)
			check[i] = false;
	}

	public static boolean rowCheck(int row) {
		checkClear();
		for (int i = 0; i < N; i++) {
			int now = MAP[row][i];

			if (check[now])
				return false;
			else
				check[now] = true;
		}
		return true;
	}

	public static boolean colCheck(int col) {
		checkClear();
		for (int i = 0; i < N; i++) {
			int now = MAP[i][col];

			if (check[now])
				return false;
			else
				check[now] = true;
		}
		return true;
	}

	public static boolean rectCheck(int row, int col) {
		checkClear();

		for (int i = row; i < row + 3; i++) {
			for (int j = col; j < col + 3; j++) {
				int now = MAP[i][j];

				if (check[now])
					return false;
				else
					check[now] = true;
			}
		}

		return true;
	}
}
