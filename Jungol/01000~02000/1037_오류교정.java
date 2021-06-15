package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ErrorCorrection_1037 {
	static int[] row, col;
	static int N;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/ErrorCorrection.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 초기화
		N = Integer.parseInt(br.readLine());
		row = new int[N + 1];
		col = new int[N + 1];

		// 값 세팅
		for (int i = 1; i <= N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int sum = 0;

			for (int j = 1; j <= N; j++) {
				int num = Integer.parseInt(st.nextToken());
				col[j] += num;
				sum += num;
			}

			row[i] = sum;
		}

		// 패리티 성질 확인
		if (parityCheck(row) && parityCheck(col))
			System.out.println("OK");
		else {
			int rowIdx = notParityIndex(row);
			int colIdx = notParityIndex(col);

			if (rowIdx == -1 || colIdx == -1)
				System.out.println("Corrupt");
			else
				System.out.println("Change bit (" + rowIdx + "," + colIdx + ")");
		}
	}

	private static boolean parityCheck(int[] arr) {
		// 패리티 성질 확인
		for (int i = 1; i < N + 1; i++)
			if (arr[i] % 2 != N % 2)
				return false;
		return true;
	}

	private static int notParityIndex(int[] arr) {
		// 패리티 성질을 위배한 idx return
		int Idx = 0;
		for (int i = 1; i < N + 1; i++) {
			if ((N - arr[i]) % 2 != N % 2)
				if (Idx == 0)
					Idx = i;
				else
					return -1; // 한 비트로 해소 할 수 없다면(한 행/열에 2개 이상인 경우)
		}
		return Idx; // 한 비트로 해소 할 수 있다면 해당 index return
	}
}
