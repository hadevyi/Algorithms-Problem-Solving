package com.swexpertacademy;

import java.io.FileInputStream;
import java.util.Scanner;

public class Crops_2805 {
	static int[][] DATA;
	static int T, N, HalfN, TOTAL;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Crops_input.txt"));
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			TOTAL = 0;
			N = sc.nextInt();
			HalfN = N / 2;
			DATA = new int[N][N];

			for (int i = 0; i < N; i++) {
				String temp = sc.next();

				for (int j = 0; j < N; j++) {
					DATA[i][j] = temp.charAt(j) - '0';
				}
			}

			// 다이아몬드 합산하기
			int step = HalfN, check = 1;
			for (int i = 0; i < N; i++) {
				for (int j = step; j < step + check; j++)
					TOTAL += DATA[i][j];
				step = i > HalfN - 1 ? step + 1 : step - 1;
				check = i > HalfN - 1 ? check - 2 : check + 2;
			}

			System.out.println("#" + oneCase + " " + TOTAL);
		}

		sc.close();
	}
}