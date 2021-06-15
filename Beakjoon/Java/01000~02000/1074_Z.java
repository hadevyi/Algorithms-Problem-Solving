package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Z_1074 {
	static int N, R, C, NUM;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		N = (int) Math.pow(2, N); // 2^N의 정사각형

		search(0, 0, N);
		System.out.println(NUM);
	}

	public static void search(int i, int j, int MAX) {
		if (MAX == 1)
			return;

		if (R < i + MAX / 2 && C < j + MAX / 2) {
			search(i, j, MAX / 2);
		} else if (R < i + MAX / 2 && C >= j + MAX / 2) {
			NUM += MAX/2 * MAX/2;
			search(i, j + MAX / 2, MAX / 2);
		} else if (R >= i + MAX / 2 && C < j + MAX / 2) {
			NUM += MAX/2 * MAX/2 * 2;
			search(i + MAX / 2, j, MAX / 2);
		} else {
			NUM += MAX/2 * MAX/2 * 3;
			search(i + MAX / 2, j + MAX / 2, MAX / 2);
		}
	}
}
