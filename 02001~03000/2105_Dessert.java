package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Dessert_2105 {
	static int T, N, TOTAL;
	static int[][] map;
	static boolean[][] check;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Dessert.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			// 기본 데이터 초기화
			TOTAL = -1;
			N = Integer.parseInt(br.readLine());
			map = new int[N][N];
			check = new boolean[N][N];

			// map 입력
			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}

			// 모든 좌표의 순회 살펴보기
			search();

			// 결과 출력
			System.out.println("#" + t + " " + TOTAL);
		}
	}

	private static void search() {
		// 시작 꼭짓점의 범위
		// i : 최소 높이가 3을 필요로 하기 때문에, i < N-2
		// j : 0와 N-1은 시작 꼭지점으로 들어갈 수 없기에, 0 < j < N-1
		HashSet<Integer> log = new HashSet<>();
		for (int i = 0; i < N - 2; i++) {
			for (int j = 1; j < N - 1; j++) {
				clear();
				log.clear();
				log.add(map[i][j]);
				check[i][j] = true;
				dfs(i, j, log, 0, i, j);
				check[i][j] = false;
				log.remove(map[i][j]);

			}
		}
	}

	static int[][] DELTA = { { 1, 1 }, { 1, -1 }, { -1, -1 }, { -1, 1 } };

	private static void dfs(int i, int j, HashSet<Integer> log, int dir, int startI, int startJ) {
		for (int d = dir; d < 4; d++) {
			int ni = i + DELTA[d][0];
			int nj = j + DELTA[d][1];

			if (ni == startI && nj == startJ && log.size() >= 4) {
				TOTAL = Math.max(log.size(), TOTAL);
				return;
			}

			if (ni < 0 || ni >= N || nj < 0 || nj >= N || check[ni][nj] || log.contains(map[ni][nj]))
				continue;

			log.add(map[ni][nj]);
			check[ni][nj] = true;
			dfs(ni, nj, log, d, startI, startJ);
			check[ni][nj] = false;
			log.remove(map[ni][nj]);

		}
	}

	private static void clear() {
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				check[i][j] = false;
	}
}
