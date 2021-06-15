package exam;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WeightClub_20299 {
	static int N, K, L;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");

		N = Integer.parseInt(st.nextToken());
		K = Integer.parseInt(st.nextToken());
		L = Integer.parseInt(st.nextToken());

		int count = 0;
		StringBuilder sb = new StringBuilder("");

		for (int n = 0; n < N; n++) {
			boolean pass = false;
			int[] num = new int[3];
			int sum = 0;
			input = br.readLine();
			st = new StringTokenizer(input, " ");

			for (int i = 0; i < 3; i++) {
				num[i] = Integer.parseInt(st.nextToken());
				if (num[i] < L) {
					pass = true;
					break;
				}
				sum += num[i];
			}

			if (pass || sum < K)
				continue;

			count++;
			for (int i = 0; i < 3; i++)
				sb.append(num[i]).append(" ");
		}

		System.out.println(count);
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.lastIndexOf(" "));
			System.out.println(sb);
		}
	}
}
