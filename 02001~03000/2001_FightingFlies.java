package homework;

import java.io.FileInputStream;
import java.util.Scanner;

public class FightingFlies_2001 {

	static int[][] DATA;
	static int T, MAX, N, M;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("inputfile/Eradication_input.txt"));
		Scanner sc = new Scanner(System.in);

		T = sc.nextInt();

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = sc.nextInt(); // 정사각형의 크기
			M = sc.nextInt(); // 면적의 크기

			DATA = new int[N][N]; // DATA 파일 세팅

			// 전체 값 입력받기
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++)
					DATA[i][j] = sc.nextInt();

			MAX = 0;
			// 값 확인하기
			for (int i = 0; i <= N - M; i++) {
				for (int j = 0; j <= N - M; j++) {
					int tempMax = 0;

					for (int tempI = i; tempI < i + M; tempI++)
						for (int tempJ = j; tempJ < j + M; tempJ++)
							tempMax += DATA[tempI][tempJ];

					if (MAX < tempMax)
						MAX = tempMax;
				}
			}

			System.out.println("#" + oneCase + " " + MAX);
			//print();
		}

		sc.close();
	}

	/*
	private static void print() {
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++)
				System.out.print(DATA[i][j] + " ");
			System.out.println();
		}
	}
	*/
}
