import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	static int R, C, T, TOTAL;
	static int up, down;
	static int[][] map, div, mod;
	static int[][] DELTA = { { 0, 1 }, { -1, 0 }, { 0, -1 }, { 1, 0 } }; // 우, 상, 좌, 하 (윗 공기순환;역은 x에 *-1)

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		T = Integer.parseInt(st.nextToken());
		map = new int[R][C];
		up = down = -1;
		TOTAL = 0;

		for (int i = 0; i < R; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < C; j++) {
				int num = Integer.parseInt(st.nextToken());
				map[i][j] = num;

				if (num == -1 && up == -1)
					up = i;
				else if (num == -1 && down == -1)
					down = i;
			}
		}

		// System.out.println("위 순환 시작 좌표 : " + upR + " " + upC);
		// System.out.println("아래 순환 시작 좌표 : " + downR + " " + downC);

		for (int t = 0; t < T; t++) {
			div = new int[R][C];
			mod = new int[R][C];
			diffusionDust();
			sumDust();
			moveDustUp();
			moveDustDown();
		}

		cntTOTAL();
		System.out.println(TOTAL);
	}

	private static void diffusionDust() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				int now = map[i][j];
				if (now != -1) {
					int count = 0;
					for (int d = 0; d < 4; d++) {
						int ni = i + DELTA[d][0];
						int nj = j + DELTA[d][1];

						if (ni < 0 || nj < 0 || ni >= R || nj >= C || map[ni][nj] == -1)
							continue;

						count++;
						mod[ni][nj] += now / 5;
					}
					div[i][j] = now - (now / 5) * count;
				}
			}
		}
	}

	private static void sumDust() {
		for (int i = 0; i < R; i++) {
			for (int j = 0; j < C; j++) {
				int now = map[i][j];
				if (now != -1)
					map[i][j] = div[i][j] + mod[i][j];
			}
		}

	}

	private static void moveDustUp() {
		map[up][0] = 0;

		for (int i = up - 1; i > 0; i--)
			map[i][0] = map[i - 1][0];

		for (int j = 0; j < C - 1; j++)
			map[0][j] = map[0][j + 1];

		for (int i = 0; i < up; i++)
			map[i][C - 1] = map[i + 1][C - 1];

		for (int j = C - 1; j > 1; j--)
			map[up][j] = map[up][j - 1];

		map[up][1] = 0;
		map[up][0] = -1;
	}

	private static void moveDustDown() {
		map[down][0] = 0;

		for (int i = down + 1; i < R - 1; i++)
			map[i][0] = map[i + 1][0];

		for (int j = 0; j < C - 1; j++)
			map[R - 1][j] = map[R - 1][j + 1];

		for (int i = R - 1; i > down - 1; i--)
			map[i][C - 1] = map[i - 1][C - 1];

		for (int j = C - 1; j > 1; j--)
			map[down][j] = map[down][j - 1];

		map[down][1] = 0;
		map[down][0] = -1;
	}

	private static void cntTOTAL() {
		for (int i = 0; i < R; i++)
			for (int j = 0; j < C; j++)
				if (map[i][j] != -1)
					TOTAL += map[i][j];
	}
}