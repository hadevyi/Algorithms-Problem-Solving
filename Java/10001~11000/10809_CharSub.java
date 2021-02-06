package beakjoon;

import java.util.Scanner;

public class CharSub_10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] str = sc.next().toCharArray();
		int[] cnt = new int[26];

		for (int i = 0; i < 26; i++)
			cnt[i] = -1;

		for (int i = 0; i < str.length; i++)
			if (cnt[(int) str[i] - (int) 'a'] == -1)
				cnt[(int) str[i] - (int) 'a'] = i;

		for (int i = 0; i < 26; i++)
			System.out.print(cnt[i] + " ");
		sc.close();
	}
}
