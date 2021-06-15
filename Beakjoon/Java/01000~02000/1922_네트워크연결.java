package Gold4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Network_1922 {
	static int N, M;
	static int[] parent;
	static Edge[] edges;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());

		parent = new int[N+1];
		edges = new Edge[M];
		makeSet();

		for (int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int w = Integer.parseInt(st.nextToken());
			edges[i] = new Edge(x, y, w);
		}
		
		Arrays.sort(edges);

		int result = 0, cnt = 0;
		for (Edge edge : edges) {
			if (unionSet(edge.from, edge.to)) {
				result += edge.weight;
				if (++cnt == N - 1)
					break;
			}
		}
		
		System.out.println(result);
	}

	private static void makeSet() {
		for (int i = 0; i < N; i++)
			parent[i] = i;
	}

	private static int findSet(int x) {
		if (x == parent[x])
			return x;
		return parent[x] = findSet(parent[x]);
	}

	private static boolean unionSet(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);

		if (aRoot == bRoot)
			return false;

		if (aRoot < bRoot)
			parent[bRoot] = aRoot;
		else
			parent[aRoot] = bRoot;

		return true;
	}

	static class Edge implements Comparable<Edge>{
		public int from;
		public int to;
		public int weight;

		public Edge(int from, int to, int weight) {
			this.from = from;
			this.to = to;
			this.weight = weight;
		}

		@Override
		public int compareTo(Edge o) {
			return this.weight - o.weight;
		}
	}
}
