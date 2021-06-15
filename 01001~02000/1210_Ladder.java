package com.swexpertacademy;

import java.io.FileInputStream;
import java.util.Scanner;

public class Ladder_1210 {
	static int testCase = 10, N = 100;
	static int[][] DELTA = { { 0, 1 }, { 0, -1 }, { -1, 0 }, { 1, 0 } }; // 4방 탐색 델타 (좌우상하)
	static int[][] Area;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/ladder_1210.txt"));
		Scanner sc = new Scanner(System.in);

		Area = new int[N][N];

		for (int oneCase = 1; oneCase <= testCase; oneCase++) {
			int caseNumber = sc.nextInt();
			int moveX = N, moveY = N;
			// NxN 정보 입력
			for (int i = 0; i < N; i++)
				for (int j = 0; j < N; j++) {
					Area[i][j] = sc.nextInt();

					if (Area[i][j] == 2) { // 도착위치 확인
						moveX = i;
						moveY = j;
					}
				}
			// 이동
			while (true) {
				for (int i = 0; i < 3; i++) {
					int newX = moveX + DELTA[i][0];
					int newY = moveY + DELTA[i][1];

					if (newX >= 0 && newX < N && newY >= 0 && newY < N && Area[newX][newY] == 1) {
						Area[newX][newY] = 0;
						moveX = newX;
						moveY = newY;
						break;
					}
				}
				if (moveX == 0)
					break;
			}
			System.out.println("#" + caseNumber + " " + moveY);

		}

		sc.close();
	}
}
