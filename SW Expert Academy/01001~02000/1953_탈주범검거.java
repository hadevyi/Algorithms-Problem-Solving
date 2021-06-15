import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	static int T, N, M, R, C, L;
	static int[][] map;
	static boolean[][] visited;

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("input/SW/탈주범 검거.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			R = Integer.parseInt(st.nextToken());
			C = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());
			map = new int[N][M];
			visited = new boolean[N][M];

			for (int i = 0; i < N; i++) {
				st = new StringTokenizer(br.readLine());
				for (int j = 0; j < M; j++)
					map[i][j] = Integer.parseInt(st.nextToken());
			}

			ckeckMap();
			// print();
			System.out.println("#" + t + " " + cntVisited());
		}

	}

	private static int cntVisited() {
		int count = 0;
		for (int i = 0; i < N; i++)
			for (int j = 0; j < M; j++)
				if (visited[i][j])
					count++;
		return count;
	}

	private static void ckeckMap() {
		int time = 1;
		Queue<Point> queue = new LinkedList<Point>();
		queue.offer(new Point(R, C));
		visited[R][C] = true;

		while (!queue.isEmpty()) {
			if (time++ == L)
				return;
			int size = queue.size();

			for (int s = 0; s < size; s++) {
				Point p = queue.poll();
				int[][] DELTA = getDelta(map[p.x][p.y]);
				int D = DELTA.length;

				for (int d = 0; d < D; d++) {
					int nx = p.x + DELTA[d][0];
					int ny = p.y + DELTA[d][1];

					if (nx < 0 || ny < 0 || nx >= N || ny >= M || visited[nx][ny] || map[nx][ny] == 0)
						continue;

					if (check(DELTA[d][0], DELTA[d][1], map[nx][ny])) {
						visited[nx][ny] = true;
						queue.offer(new Point(nx, ny));
					}
				}

			}
		}

	}

	private static boolean check(int dirX, int dirY, int nextDir) {
		int[][] DELTA = getDelta(nextDir);
		int size = DELTA.length;
		dirX *= -1;
		dirY *= -1;
		
		for(int i=0;i<size;i++)
			if(DELTA[i][0] == dirX && DELTA[i][1] == dirY)
				return true;		
		return false;
	}

	private static int[][] getDelta(int option) {
		switch (option) {
		case 1: // 상하좌우
			int[][] temp = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };
			return temp;
		case 2: // 상하
			int[][] temp1 = { { -1, 0 }, { 1, 0 } };
			return temp1;
		case 3: // 좌우
			int[][] temp2 = { { 0, -1 }, { 0, 1 } };
			return temp2;
		case 4: // 상우
			int[][] temp3 = { { -1, 0 }, { 0, 1 } };
			return temp3;
		case 5: // 하우
			int[][] temp4 = { { 1, 0 }, { 0, 1 } };
			return temp4;
		case 6: // 하좌
			int[][] temp5 = { { 1, 0 }, { 0, -1 } };
			return temp5;
		case 7: // 상좌
			int[][] temp6 = { { -1, 0 }, { 0, -1 } };
			return temp6;
		}
		return null;
	}

	private static void print() {
		for (int i = 0; i < N; i++)
			System.out.println(Arrays.toString(visited[i]));
	}

	static class Point {
		public int x;
		public int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

}