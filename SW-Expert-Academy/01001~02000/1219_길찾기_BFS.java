package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class FindLoad_1219_BFS {

	static int T, N;
	static final int MAX = 100;
	static int[][] map;
	static boolean flag;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/supplement/FindLoad.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= 10; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int tc = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			map = new int[MAX][MAX];
			flag = false;

			st = new StringTokenizer(br.readLine());

			for (int i = 0; i < N; i++) {
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());

				map[x][y] = 1;
			}

			bfs(0);

			System.out.println("#" + tc + " " + (flag ? 1 : 0));
		}

	}

	private static void bfs(int startIdx) {
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(startIdx);

		while (!queue.isEmpty()) {
			int now = queue.poll();

			if (now == 99) {
				flag = true;
				return;
			}

			for (int j = 0; j < MAX; j++) {
				if (map[now][j] == 1) {
					queue.offer(j);
				}
			}
		}
	}

}
