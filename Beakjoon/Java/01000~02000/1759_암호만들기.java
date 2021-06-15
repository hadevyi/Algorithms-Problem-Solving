package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class MakePassword_1759 {
	static int N, R; // N 만들어내야할 암호 길이, R 총 길이
	static char[] chr; // 암호 대상이 될 char 모음
	static boolean[] check;
	static char[] result;
	static StringBuilder sb = new StringBuilder("");

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		chr = new char[R];
		check = new boolean[R];
		result = new char[N];

		int idx = 0;
		char[] temp = br.readLine().toCharArray();
		for (char c : temp) {
			if (c != ' ') {
				chr[idx++] = c;
			}
		}

		Arrays.sort(chr); // char Sorting하기
		System.out.println(Arrays.toString(chr));

		per(0);
		System.out.println(sb.toString());
	}

	private static void per(int idx) {
		if (idx == N) {
			if (orderCheck() && eachCheck()) {
				for (char c : result) {
					sb.append(c);
				}
				sb.append("\n");
				// System.out.println(Arrays.toString(result));
			}
			return;
		}

		for (int i = idx; i < R; i++) {
			if (check[i])
				continue;

			result[idx] = chr[i];
			check[i] = true;
			per(idx + 1);
			check[i] = false;
		}
	}

	private static boolean orderCheck() {
		for (int i = 0; i < N - 1; i++) {
			if (result[i] > result[i + 1]) {
				return false;
			}
		}
		return true;
	}

	private static boolean eachCheck() {
		int aeiou = 0;
		int other = 0;

		for (char c : result) {
			if (c == 'a' || c == 'e' || c == 'u' || c == 'i' || c == 'o')
				aeiou++;
			else
				other++;
		}

		if (aeiou >= 1 && other >= 2)
			return true;
		else
			return false;
	}
}
