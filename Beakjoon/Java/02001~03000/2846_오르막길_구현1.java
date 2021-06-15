package bronze2;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 오르막길_2846_구현1 {

	static int N, Len, SIZE;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("BOJ.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new int[N];
		Len = SIZE = 0;

		for (int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());

			int length = 1, last = i;
			for (int idx = i; idx >= 1; idx--) {
				if (arr[idx - 1] < arr[idx]) {
					length++;
					last = idx - 1;
				}

				if (idx - 1 == 0 || arr[idx - 1] >= arr[idx]) {
					if (length > 1) 
						SIZE = Math.max(arr[i] - arr[last], SIZE);
					break;
				}
			}
			//System.out.println("====================");
		}

		System.out.println(SIZE);
	}
}
