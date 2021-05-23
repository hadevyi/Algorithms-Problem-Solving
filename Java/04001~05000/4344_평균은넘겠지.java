package beakjoon;

import java.util.Scanner;

public class OverAverage_4344 {
	static int T;
	static int[] score;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		T = sc.nextInt();

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			double avg = 0;

			int subjectNum = sc.nextInt();
			score = new int[subjectNum];

			for (int i = 0; i < subjectNum; i++) {
				int temp = sc.nextInt();
				score[i] = temp;
				avg += temp;
			}

			avg /= subjectNum;
			int count = 0;

			for (int i = 0; i < subjectNum; i++)
				if (score[i] > avg)
					count++;

			avg = (double) count / subjectNum * 100;

			System.out.format("%.3f%%\n", avg);
		}

		sc.close();
	}
}
