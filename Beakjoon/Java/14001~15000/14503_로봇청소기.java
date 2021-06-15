package beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RobotCleaner_14503 {
	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } }; // 상우하좌(북동남서)
	static int[][] MAP;
	static int N, M, DIR, I, J, COUNT; // 가로, 세로, 현재 방향, 현재 청소기의 위치 i,j

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		MAP = new int[N][M];

		input = br.readLine();
		st = new StringTokenizer(input, " ");
		I = Integer.parseInt(st.nextToken());
		J = Integer.parseInt(st.nextToken());
		DIR = Integer.parseInt(st.nextToken());

		for (int i = 0; i < N; i++) {
			input = br.readLine();
			st = new StringTokenizer(input, " ");

			for (int j = 0; j < M; j++)
				MAP[i][j] = Integer.parseInt(st.nextToken());
		}

		dfs(I, J, DIR);
		System.out.println(COUNT);
	}

	public static void dfs(int i, int j, int direction) {
		if (MAP[i][j] == 1)
			return;
		else if (MAP[i][j] == 0) {
			COUNT++;
			MAP[i][j] = -1; // 청소했다고 표시
		}

		for (int k = 0; k < 4; k++) {
			// 지금 기준 왼쪽 확인
			int ni = i + DELTA[direction - 1 >= 0 ? direction - 1 : 3][0];
			int nj = j + DELTA[direction - 1 >= 0 ? direction - 1 : 3][1];

			
			if (MAP[ni][nj] == 0) {
				dfs(ni, nj, direction - 1 >= 0 ? direction - 1 : 3);
				return;
			}else
				direction = direction - 1 >= 0 ? direction - 1 : 3;
		}

		int backi = i + DELTA[direction][0]*-1;
		int backj = j + DELTA[direction][1]*-1;
		dfs(backi, backj, direction);
	}
}
