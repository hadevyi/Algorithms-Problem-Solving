package A;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class HikingLoad_1949 {
	static int T, N, K, Len;
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Hiking.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			map = new int[N][N];
			visited = new boolean[N][N];
			Len = 0;
			int max = 0;

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
					max = Math.max(map[i][j], max);
				}
			}

			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					if (max == map[i][j]) {
						visited[i][j] = true;
						// System.out.print("S: " + i + " " + j + " >");
						dfs(i, j, 1, false);
						// System.out.println();
						visited[i][j] = false;
					}

			System.out.println("#" + t + " " + Len);
		}
	}

	static int[][] DELTA = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } }; // 상하좌우
	static int D = 4;

	private static void dfs(int i, int j, int len, boolean deep) {
		// System.out.println("||");
		Len = Math.max(len, Len);

		for (int d = 0; d < D; d++) {
			int ni = i + DELTA[d][0];
			int nj = j + DELTA[d][1];

			if (ni < 0 || ni >= N || nj < 0 || nj >= N || visited[ni][nj])
				continue;

			if (map[i][j] <= map[ni][nj]) {
				if (!deep) {
					for (int k = 1; k <= K; k++) {
						if(map[ni][nj]-k<map[i][j]) {
							map[ni][nj] -=k;
							visited[ni][nj] = true;
							dfs(ni,nj,len+1,true);
							map[ni][nj] +=k;
							visited[ni][nj] = false;
						}
					}
				}
			} else {
				visited[ni][nj] = true;
				// System.out.print(ni + " " + nj + " (" + (len + 1) + ") >");
				dfs(ni, nj, len + 1, deep);
				//System.out.println();
				visited[ni][nj] = false;
			}
		}
	}
}
