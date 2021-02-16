package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class hexadecimal_1550 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		int N = input.length();
		int result = 0;

		for (int i = 0; i < N; i++) {
			char chr = input.charAt(i);

			if ('0' <= chr && chr <= '9')
				result += Math.pow(16, (N - (i + 1)))*(chr - '0');
			else if ('A' <= chr && chr <= 'F') {
				result += Math.pow(16, (N - (i + 1)))*(chr - 'A' + 10);
			}
		}

		System.out.println(result);
	}
}
