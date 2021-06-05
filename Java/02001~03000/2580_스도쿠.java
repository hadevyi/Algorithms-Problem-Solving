import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	static int N = 9, SIZE;
	static int[][] map;
	static ArrayList<Point> list = new ArrayList<Point>();

	static class Point {
		public int x;
		public int y;

		public Point(int x, int y) {
			super();
			this.x = x;
			this.y = y;
		}
	}

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int num = Integer.parseInt(st.nextToken());
				map[i][j] = num;

				if (num == 0) {
					list.add(new Point(i, j));
				}
			}
		}

		SIZE = list.size();
		int[][] tmap = copy(map);

		dfs(tmap, 0);
		print();
	}

	private static void dfs(int[][] arr, int o) {
		if (o == SIZE) {
			boolean flag = true;
			for (int i = 0; i < N; i++) {
				if (!row(arr,i) || !col(arr,i))
					flag = false;
				if (i % 3 == 0 && !block(arr,i, i))
					flag = false;
			}

			if (flag)
				map = copy(arr);
			return;
		}

		for (int i = 1; i <= 9; i++) {
			Point p = list.get(o);
			arr[p.x][p.y] = i;
			if (row(arr,p.x) && col(arr,p.y) && block(arr,p.x, p.y))
				dfs(arr, o + 1);
			arr[p.x][p.y] = 0;
		}

	}

	private static boolean row(int[][] arr, int i) {
		boolean[] visited = new boolean[N + 1];

		for (int j = 0; j < N; j++) {
			if (arr[i][j] == 0)
				continue;
			if (visited[arr[i][j]])
				return false;
			visited[arr[i][j]] = true;
		}
		return true;
	}

	private static boolean col(int[][] arr, int j) {
		boolean[] visited = new boolean[N + 1];

		for (int i = 0; i < N; i++) {
			if (arr[i][j] == 0)
				continue;
			if (visited[arr[i][j]])
				return false;
			visited[arr[i][j]] = true;
		}

		return true;
	}

	private static boolean block(int[][] arr, int i, int j) {
		boolean[] visited = new boolean[N + 1];
		i = (i / 3) * 3;
		j = (j / 3) * 3;

		for (int r = i; r < i + 3; r++) {
			for (int c = j; c < j + 3; c++) {
				if (arr[r][c] == 0)
					continue;
				if (visited[arr[r][c]])
					return false;
				visited[arr[r][c]] = true;
			}
		}
		return true;
	}

	private static int[][] copy(int[][] arr) {
		int[][] temp = new int[N][N];
		for (int i = 0; i < N; i++)
			for (int j = 0; j < N; j++)
				temp[i][j] = arr[i][j];
		return temp;
	}

	private static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(map[i][j] + " ");
			System.out.println();
		}

	}
}