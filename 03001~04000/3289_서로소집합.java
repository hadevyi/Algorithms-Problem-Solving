package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class DisjointSet_3289 {
	static int T, N, M;
	static int[] Set;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/WorkShop/DisjointSet.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = null;

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			sb = new StringBuilder("");
			sb.append("#").append(t).append(" ");

			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			Set = new int[N];

			makeSet();
			//System.out.println(Arrays.toString(Set));

			for (int m = 0; m < M; m++) {
				st = new StringTokenizer(br.readLine());

				int option = Integer.parseInt(st.nextToken());
				int a = Integer.parseInt(st.nextToken()) - 1;
				int b = Integer.parseInt(st.nextToken()) - 1;

				if (option == 0) {
					UnionSet(a, b);
				} else if (option == 1) {
					int result = CheckSet(a, b) ? 1 : 0;
					sb.append(result);
				}
				//System.out.println(Arrays.toString(Set));
			}

			System.out.println(sb.toString());
		}
	}

	private static void makeSet() {
		for (int i = 0; i < N; i++) {
			Set[i] = i;
		}
	}

	private static int findSet(int x) {
		if (Set[x] == x)
			return x;
		return Set[x] = findSet(Set[x]);
	}

	private static boolean UnionSet(int x, int y) {
		int xPerent = findSet(x);
		int yPerent = findSet(y);

		if (xPerent == yPerent)
			return false;

		Set[xPerent] = yPerent;
		return true;
	}

	private static boolean CheckSet(int x, int y) {
		return findSet(x) == findSet(y);
	}
}
