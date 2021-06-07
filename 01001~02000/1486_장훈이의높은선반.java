package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class HighShelf_1486 {
	static int T, N, S, MIN;
	static int[] height;
	static boolean[] used;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("input/supplement/HighShelf.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			MIN = Integer.MAX_VALUE;

			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			S = Integer.parseInt(st.nextToken());
			height = new int[N];
			used = new boolean[N];

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				height[i] = Integer.parseInt(st.nextToken());

			Arrays.sort(height);
			subSet(0);

			System.out.println("#" + t + " " + (MIN-S));
		}
	}

	private static void subSet(int idx) {
		if (idx == N) {
			check();
			return;
		}

		used[idx] = true;
		subSet(idx + 1);
		used[idx] = false;
		subSet(idx + 1);
	}

	private static void check() {
		int trueCnt = 0, sum = 0;
		for (int i = 0; i < N; i++)
			if (used[i]) {
				trueCnt++;
				sum += height[i];
			}

		if (trueCnt >= 1 && sum>=S)
			MIN = Math.min(sum, MIN);
	}
}
