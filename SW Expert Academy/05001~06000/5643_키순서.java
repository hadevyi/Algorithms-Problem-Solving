import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	static int T, N, M;
	static int[][] matrix;

	public static void main(String[] args) throws Exception {
		//System.setIn(new FileInputStream("SWEA.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {

			N = Integer.parseInt(br.readLine());
			matrix = new int[N + 1][N + 1];

			M = Integer.parseInt(br.readLine());
			for (int m = 0; m < M; m++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				matrix[x][y] = 1;
			}

			int cnt = 0;
			for (int i = 1; i < N + 1; i++) {
				if (bfs(i))
					cnt++;
			}
			
			//print();
			System.out.println("#" + t + " " + cnt);
		}
	}

	private static boolean bfs(int idx) {
		boolean[] perent_visited = new boolean[N + 1];
		boolean[] child_visited = new boolean[N + 1];
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.offer(idx);
		perent_visited[idx] = true;

		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int j = 1; j < N + 1; j++) {
				if (matrix[now][j] == 0 || perent_visited[j])
					continue;
				perent_visited[j] = true;
				queue.offer(j);
			}

		}
		
		//System.out.println(Arrays.toString(perent_visited));

		queue.offer(idx);
		child_visited[idx] = true;

		while (!queue.isEmpty()) {
			int now = queue.poll();

			for (int i = 1; i < N + 1; i++) {
				if (matrix[i][now] == 0 || child_visited[i])
					continue;
				child_visited[i] = true;
				queue.offer(i);
			}

		}
		
		//System.out.println(Arrays.toString(child_visited));
		
		for (int i = 1; i <= N; i++) {
			if (!(perent_visited[i] || child_visited[i])) {
				return false;
			}
		}
		return true;
	}

	private static void print() {
		for (int i = 0; i < N + 1; i++)
			System.out.println(Arrays.toString(matrix[i]));
	}
}