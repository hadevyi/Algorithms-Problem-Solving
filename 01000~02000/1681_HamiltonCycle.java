package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HamiltonCycle_1681 {
	static int N, MIN;
	static int[][] DATA;
	static boolean[] visited;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/HamiltonCycle.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		DATA = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++)
				DATA[i][j] = Integer.parseInt(st.nextToken());
		}

		MIN = Integer.MAX_VALUE;
		check();

		System.out.println(MIN);
	}

	private static void check() {
		for (int i = 0; i < N; i++) {
			visited = new boolean[N];
			if (DATA[0][i] != 0)
				dfs(0, i, 1, DATA[0][i]);
		}
	}

	private static void dfs(int i, int j, int cnt, int sum) {
		if (sum > MIN)
			return;

		visited[i] = true;

		if (cnt == N - 1) {
			if (DATA[j][0] == 0)
				return;
			sum += DATA[j][0];
			MIN = Math.min(sum, MIN);
			return;
		}

		for (int n = 0; n < N; n++) {
			if (visited[n] || DATA[j][n] == 0 || sum > MIN)
				continue;

			dfs(j, n, cnt + 1, sum + DATA[j][n]);
			visited[n] = false;
		}
	}
}
