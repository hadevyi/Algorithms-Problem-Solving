package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Alphabet_1987 {
	static int R, C, MAX = Integer.MIN_VALUE;
	static char[][] map;
	static boolean[] visited;
	static int[][] DELTA = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } }; // 상하좌우

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		map = new char[R][C];
		visited = new boolean[26];

		for (int i = 0; i < R; i++) {
			String str = br.readLine();
			for (int j = 0; j < C; j++)
				map[i][j] = str.charAt(j);
		}

		dfs(0, 0, 0);
		System.out.println(MAX);
	}

	private static void dfs(int i, int j, int cnt) {

		if (visited[map[i][j] - 'A']) {
			MAX = Math.max(MAX, cnt);
			return;
		}

		visited[map[i][j] - 'A'] = true;

		for (int d = 0; d < 4; d++) {
			int ni = i + DELTA[d][0];
			int nj = j + DELTA[d][1];

			if (ni < 0 || ni >= R || nj < 0 || nj >= C)
				continue;

			dfs(ni, nj, cnt + 1);
		}

		visited[map[i][j] - 'A'] = false;
	}

}