package supplement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RollCake_3985 {
	static int[] Cakes;
	static int N, P;
	static int expectMax, realMax, expectNum, realNum;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		P = Integer.parseInt(br.readLine());

		Cakes = new int[N+1];
		expectNum = P;
		realNum = P;

		for (int i = 1; i <= P; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int start = Integer.parseInt(st.nextToken());
			int end = Integer.parseInt(st.nextToken());
			int count = 0;
			for (int j = start; j <= end; j++)
				if (Cakes[j] == 0) {
					Cakes[j] = i;
					count++;
				}

			if (count > realMax) {
				realNum = i;
				realMax = count;
			} else if (count == realMax)
				realNum = i < realNum ? i : realNum;

			if ((end - start + 1) > expectMax) {
				expectNum = i;
				expectMax = end - start + 1;
			} else if ((end - start + 1) == expectMax)
				expectNum = i < expectNum ? i : expectNum;

		}

		System.out.println(expectNum);
		System.out.println(realNum);
	}
}
