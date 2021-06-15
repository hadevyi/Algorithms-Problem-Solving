package com.swexpertacademy;

import java.util.Scanner;

public class memory_1289 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int testCase = sc.nextInt();

		for (int oneCase = 1; oneCase <= testCase; oneCase++) {
			char basic = '0';
			int count = 0;

			char[] input = sc.next().toCharArray();

			for (int i = 0; i < input.length; i++) {
				if (basic != input[i]) {
					count++;
					basic = input[i];
				}
			}

			System.out.println("#" + oneCase + " " + count);
		}
		sc.close();
	}
}
