package com.beakjoon;

import java.util.Scanner;

public class CroatiaCharacter_2941 {
	// static String[] CROATIA = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="
	// };

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String str = sc.nextLine();

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			count++;

			if (ch == '-' && (i - 1 >= 0 && (str.charAt(i - 1) == 'c' || str.charAt(i - 1) == 'd')))
				count--;
			else if (ch == '=' && (i - 1 >= 0
					&& (str.charAt(i - 1) == 'c' || str.charAt(i - 1) == 's' || str.charAt(i - 1) == 'z'))) {
				count--;
				if (i - 2 >= 0 && str.charAt(i - 2) == 'd' && str.charAt(i - 1) == 'z')
					count--;
			} else if (ch == 'j' && (i - 1 >= 0) && (str.charAt(i - 1) == 'l' || str.charAt(i - 1) == 'n'))
				count--;
		}

		System.out.println(count);
		sc.close();
	}

}
