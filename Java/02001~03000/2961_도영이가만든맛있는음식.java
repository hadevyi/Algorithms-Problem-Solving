package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Food_2961 {
	static int N, MIN = Integer.MAX_VALUE;
	static int[] Sour, Bitter;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		Sour = new int[N];
		Bitter = new int[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			Sour[i] = Integer.parseInt(st.nextToken());
			Bitter[i] = Integer.parseInt(st.nextToken());
		}

		powerSet(0, 1, 0);
		System.out.println(MIN);
	}

	public static void powerSet(int idx, int SourTotal, int BitterTotal) {
		if (idx == N) {
			if (BitterTotal != 0)
				MIN = Math.min(Math.abs(SourTotal - BitterTotal), MIN);
			return;
		}
		powerSet(idx + 1, SourTotal, BitterTotal);
		powerSet(idx + 1, SourTotal * Sour[idx], BitterTotal + Bitter[idx]);
	}
}
