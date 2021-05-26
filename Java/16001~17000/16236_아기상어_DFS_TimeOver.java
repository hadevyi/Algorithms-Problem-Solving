package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

/*
<입력>
0 : 빈칸
1~6 : 물고기의 크기
9 : 아기 상어 위치
*/

public class BabyShark_16236_DFS {
	static int[][] map;
	static int N, feedCnt, nowSize, TOTAL;
	static int BSi = -1, BSj = -1;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];
		visited = new boolean[N][N];
		nowSize = 2; // 현재 아기상어의 크기
		TOTAL = 0; // 총 시간
		feedCnt = 0;// 현재 먹은 먹이 수

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
			//System.out.println("===========================");
			List<Feed> feed = canFeedCnt();
			if (feed.size() == 0)
				break;

			Feed now = feed.get(0);

			// 아기상어 이동
			map[BSi][BSj] = 0;
			map[now.x][now.y] = 9;
			BSi = now.x;
			BSj = now.y;

			TOTAL += now.dict; // 시간 중첩
			feedCnt++; // 먹은 먹이 수 카운트

			if (feedCnt == nowSize) { // 현재 먹은 수와 덩치가 같으면
				nowSize++; // 덩치를 1증가
				feedCnt = 0; // 먹은 수 0로 초기화
			}
		}

		System.out.println(TOTAL);
	}

	public static List<Feed> canFeedCnt() {
		List<Feed> list = new ArrayList<Feed>();

		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				if (map[i][j] < nowSize && map[i][j] != 0) {
					int temp = dict(i, j);
					list.add(new Feed(i, j, temp));
				}

		Collections.sort(list);
		//for (Feed feed : list) {
		//	System.out.println(feed.x + " " + feed.y + " " + feed.dict);
		//}

		return list;
	}

	static class Feed implements Comparable<Feed> {
		public int x;
		public int y;
		public int dict;

		public Feed(int x, int y, int dict) {
			super();
			this.x = x;
			this.y = y;
			this.dict = dict;
		}

		@Override
		public int compareTo(Feed o) {
			if (o.dict == this.dict) {
				if (o.x < this.x) // x가 작은 순(오름차순)
					return 1;
				if (o.y < this.y) // y가 작은 순(오름차순)
					return 1;
			}
			return this.dict - o.dict; // 거리가 가까운 순(오름차순)
		}
	}

	static int Now;
	static boolean[][] visited;

	private static int dict(int i, int j) {
		Now = Integer.MAX_VALUE;

		visited[i][j] = true;
		dfs(i, j, 0);
		visited[i][j] = false;

		return Now;
	}

	static int[][] DELTA = { { -1, 0 }, { 0, 1 }, { 0, -1 }, { 1, 0 } };

	private static void dfs(int i, int j, int sum) {

		for (int d = 0; d < 4; d++) {
			int ni = i + DELTA[d][0];
			int nj = j + DELTA[d][1];

			if (ni == BSi && BSj == nj) {
				Now = Math.min(sum + 1, Now);
				return;
			}

			if (ni < 0 || ni >= N || nj < 0 || nj >= N || visited[ni][nj] || map[ni][nj] > nowSize)
				continue;

			visited[ni][nj] = true;
			dfs(ni, nj, sum + 1);
			visited[ni][nj] = false;
		}
	}
}
