package study_0203;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Factorial_10872 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());

		System.out.println(factorial(1, N));
	}

	public static int factorial(int num, int max) {
		if (num == max || max == 0)
			return 1;

		return max * factorial(num, max - 1);
	}
}
