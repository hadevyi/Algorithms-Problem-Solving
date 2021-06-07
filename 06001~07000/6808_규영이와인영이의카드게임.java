package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CardGame_6808 {
	static int T, N = 9;
	static int TOTAL, winCnt, loseCnt;
	static int[] A, B, tgt;
	static boolean[] isSelected;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/input_6808.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			isSelected = new boolean[N];
			A = new int[N];
			B = new int[N];
			tgt = new int[N];
			TOTAL = 0;
			winCnt = 0;
			loseCnt = 0;

			for (int i = 0; i < N; i++)
				A[i] = Integer.parseInt(st.nextToken());

			int cnt = 0;
			for (int i = 1; i <= N * 2; i++)
				if (!isValue(A, i))
					B[cnt++] = i;

			perm(0);
			System.out.println("#" + oneCase + " " + winCnt + " " + loseCnt);
		}
	}

	private static void perm(int cnt) {
		if (cnt == N) {
			TOTAL++;
			check();
			return;
		}

		for (int i = 0; i < N; i++) {
			if (isSelected[i])
				continue;

			tgt[cnt] = B[i];
			isSelected[i] = true;
			perm(cnt + 1);
			isSelected[i] = false;
		}

	}

	private static void check() {
		int aWin = 0, bWin = 0;
		for (int i = 0; i < N; i++) {
			if (A[i] > tgt[i])
				aWin += A[i] + tgt[i];
			else if (A[i] < tgt[i])
				bWin += A[i] + tgt[i];
		}
		
		if(aWin>bWin) winCnt++;
		else if (aWin<bWin) loseCnt++;
	}

	private static boolean isValue(int[] Arr, int value) {
		for (int i = 0; i < Arr.length; i++) {
			if (Arr[i] == value)
				return true;
		}
		return false;
	}
}
