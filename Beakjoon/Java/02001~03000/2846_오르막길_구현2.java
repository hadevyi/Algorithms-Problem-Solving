package bronze2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 오르막길_2846_구현2 {

	static int N, MAX;
	static int[] arr, len;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("BOJ.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		len = new int[N];
		MAX = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			for (int idx = i; idx > 0; idx--) {
				if (arr[idx - 1] < arr[idx])
					len[i]++;
				else
					break;
			}
		}

		for (int i = 0; i < N; i++) {
			int gap = i - len[i];
			MAX = Math.max(arr[i] - arr[gap], MAX);
		}

		// System.out.println(Arrays.toString(len));
		System.out.println(MAX);
	}
}
