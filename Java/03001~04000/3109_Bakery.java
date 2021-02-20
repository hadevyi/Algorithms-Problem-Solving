package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Bakery_3109 {
	static int R, C, TOTAL;
	static char[][] map;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];

		for (int i = 0; i < R; i++)
			map[i] = br.readLine().toCharArray();

		check();
		System.out.println(TOTAL);
	}

	private static void check() {
		for (int i = 0; i < R; i++) {
			map[i][0] = 'x';
			search(i, 0);
		}
	}

	static int[] dr = { -1, 0, 1 }; // 순서가 매우 중요

	private static boolean search(int i, int j) {
		if (j == C - 1) {
			TOTAL++;
			return true;
		}

		int nr, nc = j + 1;
		for (int d = 0; d < 3; d++) {
			nr = i + dr[d];
			if (nr < 0 || nr >= R || map[nr][nc] == 'x')
				continue;

			map[nr][nc] = 'x';
			if (search(nr, nc))
				return true;
		}

		return false;
	}
}