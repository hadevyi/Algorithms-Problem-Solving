package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BabyShark_16236_BFS {
	static int N, TOTAL, BSi, BSj, nowSize, feedCnt;
	static int[][] map;
	static boolean[][] visited;

	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 1, 0 }, { 0, -1 } };
	static int D = 4;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		TOTAL = 0;
		nowSize = 2;
		feedCnt = 0;

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int temp = Integer.parseInt(st.nextToken());
				if (temp == 9) { // 현재 아기상어의 위치 저장하기
					BSi = i;
					BSj = j;
				}
				map[i][j] = temp;
			}
		}

		while (true) {
			ArrayList<Feed> feed = new ArrayList<Feed>();
			Queue<Feed> queue = new LinkedList<Feed>();
			queue.offer(new Feed(BSi, BSj, 0));
			visited = new boolean[N][N];
			visited[BSi][BSj] = true;

			while (!queue.isEmpty()) {
				Feed now = queue.poll();

				for (int d = 0; d < D; d++) {
					int ni = now.x + DELTA[d][0];
					int nj = now.y + DELTA[d][1];

					if (ni < 0 || ni >= N || nj < 0 || nj >= N || visited[ni][nj])
						continue;

					if (map[ni][nj] != 0 && map[ni][nj] < nowSize) {
						queue.offer(new Feed(ni, nj, now.dict + 1));
						feed.add(new Feed(ni, nj, now.dict + 1));
						visited[ni][nj] = true;
					}else if(map[ni][nj] == 0 || map[ni][nj] == nowSize) {
						queue.offer(new Feed(ni, nj, now.dict + 1));
						visited[ni][nj] = true;						
					}
				}
			}

			if (feed.size() == 0)
				break;

			int minX, minY, minDis;
			minX = minY = minDis = Integer.MAX_VALUE;

			for (Feed f : feed) {
				if (minDis > f.dict) {
					minX = f.x;
					minY = f.y;
					minDis = f.dict;
				} else if (minDis == f.dict) {
					if (minX > f.x) {
						minX = f.x;
						minY = f.y;
					} else if (minX == f.x) {
						if (minY > f.y)
							minY = f.y;
					}
				}
			}

			// System.out.println(minX+" "+minY+" "+minDis+" : "+map[minX][minY]);
			TOTAL += minDis;
			feedCnt++;

			if (feedCnt == nowSize) {
				nowSize++;
				feedCnt = 0;
			}

			map[BSi][BSj] = 0;
			BSi = minX;
			BSj = minY;
		}

		System.out.println(TOTAL);
	}

	static class Feed {
		public int x;
		public int y;
		public int dict;

		public Feed(int x, int y, int dict) {
			super();
			this.x = x;
			this.y = y;
			this.dict = dict;
		}
	}
}
