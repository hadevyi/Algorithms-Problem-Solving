import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
	static int R, G, B, Result, N = 3;
	static int[] one = new int[N];

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		for (int n = 0; n < N; n++) {
			int value = Integer.parseInt(st.nextToken());

			for (int b = 3; b > 0; b--) {
				Result += value / b;

				if (b == 1)
					one[n] = value / b;

				value = value % b;
			}
		}

		while (true) {
			int min = less_one();

			if (min == -1)
				break;

			Result += min;

			for (int i = 0; i < N; i++) {
				if (one[i] > 0) {
					one[i] -= min;
					Result -= min;
				}
			}
		}

		System.out.println(Result);
	}

	private static int less_one() {
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			if (one[i] > 0)
				min = Math.min(one[i], min);
		}

		return min == Integer.MAX_VALUE ? -1 : min;
	}
}
