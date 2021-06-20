import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	static int T, N;
	static int[][] map, ans;
	static boolean[][] visited;
	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("input/HomeWork/보급로.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			N = Integer.parseInt(br.readLine());

			map = new int[N][N];
			ans = new int[N][N];
			visited = new boolean[N][N];

			for (int i = 0; i < N; i++) {
				String str = br.readLine();
				for (int j = 0; j < N; j++)
					map[i][j] = str.charAt(j) - '0';
			} // map 입력

			System.out.println("#" + t + " " + dijkstra(0, 0));
		}
	}

	private static int dijkstra(int x, int y) {
		// 초기화
		for (int i = 0; i < N; i++)
			Arrays.fill(ans[i], Integer.MAX_VALUE);

		// 시작 위치 초기화
		ans[x][y] = 0;
		visited[x][y] = true;

		for (int d = 0; d < 4; d++) {
			int nx = x + DELTA[d][0];
			int ny = y + DELTA[d][1];

			if (nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny])
				continue;

			ans[nx][ny] = map[nx][ny];
		}

		for (int n = 0; n < N * N - 2; n++) {
			// print();
			int min = Integer.MAX_VALUE;
			int minX = -1;
			int minY = -1;

			// 최소 위치 값 찾기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (!visited[i][j] && ans[i][j] != Integer.MAX_VALUE && ans[i][j] < min) {
						min = ans[i][j];
						minX = i;
						minY = j;
					}
				}
			}

			// 방문 체크
			visited[minX][minY] = true;

			for (int d = 0; d < 4; d++) {
				int nx = minX + DELTA[d][0];
				int ny = minY + DELTA[d][1];

				if (nx < 0 || ny < 0 || nx >= N || ny >= N || visited[nx][ny])
					continue;

				if (ans[nx][ny] > ans[minX][minY] + map[nx][ny]) {
					ans[nx][ny] = ans[minX][minY] + map[nx][ny];
				}
			}
		}

		return ans[N - 1][N - 1];
	}

	private static void print() {
		for (int i = 0; i < N; i++)
			System.out.println(Arrays.toString(ans[i]));
	}
}