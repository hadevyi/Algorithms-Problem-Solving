package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
 * 1 						> 0
 * 2 (-1) 					> 1
 * 3 (/3) 					> 1
 * 4 (/2) 2 (/2||-1) 		> 2
 * 5 (-1) 4 (/2) 2 (/2||-1) > 3
 * 6 (/3) 2 (-1) 			> 2
 * 7 (-1) 6 (/3) 2 (-1)		> 3
 * 8 (/2) 4 (/2) 2 (-1)		> 3
 * 9 (/3) 3 (/3)			> 2 
 */

public class MakeOne_1463 {
	static int N, TOTAL;
	static int[] memoi;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());

		memoi = new int[N + 1]; // 0은 dummy
		memoi[1] = 0;

		for (int n = 2; n <= N; n++) {
			memoi[n] = memoi[n-1]+1;

			if (n % 3 == 0) memoi[n] = Math.min(memoi[n],memoi[n / 3] + 1);
			if (n % 2 == 0) memoi[n] = Math.min(memoi[n], memoi[n / 2] + 1);
		}

		//System.out.println(Arrays.toString(memoi));
		System.out.println(memoi[N]);
	}

}
