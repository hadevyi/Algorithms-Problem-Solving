package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Cheese_2636 {

	static int N, M, TOTAL, COUNT;
	static int[][] cheese;
	static boolean[][] remove;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());

		cheese = new int[N][M];
		TOTAL = 0; // 아직 남아있는 치즈의 수
		COUNT=0;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < M; j++) {
				cheese[i][j] = Integer.parseInt(st.nextToken());
				if(cheese[i][j] == 1)
				TOTAL++;
			}
		}
		bfs(0, 0);
		remove = new boolean[N][M];
		int beforeCheese = 0;
		while (TOTAL > 0) {
//			System.out.println(idx + " " + idy);
			meltCheese();
			beforeCheese = TOTAL;
			removeCheese();
			idSetting();

			COUNT++;
		}

		System.out.println(COUNT);
		System.out.println(beforeCheese);
	}

	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 상우하좌

	private static void idSetting() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (cheese[i][j] == 0) {
					for (int d = 0; d < 4; d++) {
						int ni = i + DELTA[d][0];
						int nj = j + DELTA[d][1];

						if (ni < 0 || ni >= N || nj < 0 || nj >= M || cheese[ni][nj] == 1)
							continue;

						if (cheese[ni][nj] == -1) {
							bfs(i,j);
						}
					}
				}
			}
		}
	}

	private static void bfs(int starti, int startj) {
		Queue<int[]> queue = new LinkedList<>();
		queue.offer(new int[] { starti, startj });
		cheese[starti][startj] = -1;

		while (!queue.isEmpty()) {
			int[] now = queue.poll();

			for (int d = 0; d < 4; d++) {
				int ni = now[0] + DELTA[d][0];
				int nj = now[1] + DELTA[d][1];

				if (ni < 0 || ni >= N || nj < 0 || nj >= M || cheese[ni][nj] == 1)
					continue;

				if (cheese[ni][nj] == 0) {
					queue.offer(new int[] { ni, nj });
					cheese[ni][nj] = -1;
				}
			}
		}
	}

	private static void meltCheese() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < M; j++) {
				if (cheese[i][j] != 1)
					continue;

				for (int d = 0; d < 4; d++) {
					int ni = i + DELTA[d][0];
					int nj = j + DELTA[d][1];

					if (ni < 0 || ni >= N || nj < 0 || nj >= M)
						continue;

					if (cheese[ni][nj] == -1)
						remove[i][j] = true;
				}
			}
		}
	}

	private static void removeCheese() {
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (remove[i][j]) {
					cheese[i][j] = -1;
					TOTAL--;
					remove[i][j] = false;
				}
	}
}
