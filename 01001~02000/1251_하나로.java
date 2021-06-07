package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Hanaro_1251 {

	static int T, N;
	static double RESULT;
	static double E;
	static int[] parents;
	static ArrayList<Node> nodes;
	static ArrayList<Edge> edges;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/HomeWork/Hanaro.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			// 초기화
			N = Integer.parseInt(br.readLine());
			nodes = new ArrayList<Node>();
			edges = new ArrayList<Edge>();
			parents = new int[N];
			RESULT = 0;
			makeSet();

			// 값 세팅
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int x = Integer.parseInt(st.nextToken());
				nodes.add(new Node(x, 0));
			}

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++) {
				int y = Integer.parseInt(st.nextToken());
				nodes.get(i).y = y;
			}

			E = Double.parseDouble(br.readLine());

			// 자료구조 정리
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++)
					edges.add(new Edge(i, j));
			}

			// Collection Sorting
			Collections.sort(edges);

			int count = 0;
			for (Edge edge : edges)
				if (unionSet(edge.start, edge.end)) {
					RESULT += Math.pow(edge.length, 2);
					if (++count == N - 1)
						break;
				}

			System.out.println("#" + t + " " + Math.round(RESULT * E));
		}
	}

	private static void makeSet() {
		for (int i = 0; i < N; i++)
			parents[i] = i;
	}

	private static int findSet(int a) {
		if (parents[a] == a)
			return a;
		return parents[a] = findSet(parents[a]);
	}

	private static boolean unionSet(int a, int b) {
		int aRoot = findSet(a);
		int bRoot = findSet(b);

		if (aRoot == bRoot)
			return false;

		if (aRoot < bRoot)
			parents[bRoot] = aRoot;
		else
			parents[aRoot] = bRoot;

		return true;
	}

	static class Edge implements Comparable<Edge> {
		public int start;
		public int end;
		public double length;

		public Edge(int start, int end) {
			this.start = start;
			this.end = end;
			this.length = getLength();
		}

		private double getLength() {
			return Math.sqrt(Math.pow(Math.abs(nodes.get(start).x - nodes.get(end).x), 2)
					+ Math.pow(Math.abs(nodes.get(start).y - nodes.get(end).y), 2));
		}

		@Override
		public int compareTo(Edge o) {
			return Double.compare(this.length, o.length);
		}

		@Override
		public String toString() {
			return "Edge [start=" + start + ", end=" + end + ", length=" + length + "]";
		}

	}

	static class Node {
		public int x, y;

		public Node(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return "Node [x=" + x + ", y=" + y + "]";
		}
	}

}
