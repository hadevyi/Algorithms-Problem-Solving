package com.swexpertacademy;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class flatten_1208 {
	static int[] T;
	static int Dump, testCase = 10, SIZE = 100;

	public static void main(String[] args) throws FileNotFoundException {
		System.setIn(new FileInputStream("inputfile/flatten_1208.txt"));
		Scanner sc = new Scanner(System.in);

		for (int oneCase = 1; oneCase <= testCase; oneCase++) {
			Dump = sc.nextInt();
			T = new int[100];
			for (int i = 0; i < SIZE; i++)
				T[i] = sc.nextInt();

			int min = T[0], max = T[0];
			int minIndex = 0, maxIndex = 0;

			for (int oneDump = 0; oneDump < Dump; oneDump++) {
				// 현재의 최대-소값의 위치값 구하기
				for (int i = 0; i < SIZE; i++) {
					if (min > T[i])
						minIndex = i;
					if (max < T[i])
						maxIndex = i;
				}

				// 새로운 min-max 세팅
				T[minIndex] += 1;
				T[maxIndex] -= 1;
				min = T[minIndex];
				max = T[maxIndex];
			}

			min = T[0];
			max = T[0];
			for (int i = 0; i < SIZE; i++) {
				if (min > T[i])
					min = T[i];
				if (max < T[i])
					max = T[i];
			}

			System.out.println("#" + oneCase + " " + (max - min));
		}

		sc.close();
	}
}
