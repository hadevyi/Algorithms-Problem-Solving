package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Religion_1863 {
	static int N, M;
	static int[] perents;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Religion.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		perents = new int[N];

		makeSet();

		for (int m = 0; m < M; m++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()) - 1;
			int b = Integer.parseInt(st.nextToken()) - 1;

			unionSet(a, b);
		}

		int count = 0;
		for (int i = 0; i < N; i++)
			if (perents[i] == i)
				count++;

		System.out.println(count);
	}

	private static void makeSet() {
		for (int i = 0; i < N; i++) {
			perents[i] = i;
		}
	}

	private static int findSet(int x) {
		if (perents[x] == x)
			return x;
		return perents[x] = findSet(perents[x]);
	}

	private static boolean unionSet(int x, int y) {
		int xPerents = findSet(x);
		int yPerents = findSet(y);

		if (xPerents == yPerents)
			return false;

		if (xPerents < yPerents)
			perents[yPerents] = x;
		else
			perents[xPerents] = y;

		return true;
	}
}
