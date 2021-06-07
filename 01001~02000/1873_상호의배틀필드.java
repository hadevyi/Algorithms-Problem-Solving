package com.swexpertacademy;

import java.io.FileInputStream;
import java.util.Scanner;

public class Battlefield_1873 {
	static int[][] DELTA = { { -1, 0 }, { 1, 0 }, { 0, -1 }, { 0, 1 } };// 4방 탐색 뎉타(상하좌우)
	static char[][] FIELD;
	static char[] MOVE;
	static int TestCase, H, W, N, DIR;

	public static void main(String[] args) throws Exception {

		System.setIn(new FileInputStream("inputfile/Battlefield_input.txt"));
		Scanner sc = new Scanner(System.in);

		TestCase = sc.nextInt();

		for (int oneCase = 1; oneCase <= TestCase; oneCase++) {
			// 데이터 값 입력받기
			H = sc.nextInt(); // 높이
			W = sc.nextInt(); // 너비
			FIELD = new char[H][W];

			for (int i = 0; i < H; i++)
				FIELD[i] = sc.next().toCharArray(); // FIELD 초기 정보

			N = sc.nextInt(); // 움직임 정보 길이
			MOVE = new char[N];
			MOVE = sc.next().toCharArray(); // 움직임 정보
			//System.out.println(Arrays.toString(MOVE));

			int x = 0, y = 0; // 전차의 위치 값
			for (int i = 0; i < H; i++)
				for (int j = 0; j < W; j++)
					if (FIELD[i][j] == '>' || FIELD[i][j] == '^' || FIELD[i][j] == '<' || FIELD[i][j] == 'v') {
						x = i;
						y = j;

						// 위치 값 배치
						if (FIELD[i][j] == '>') DIR = 3;
						else if (FIELD[i][j] == '^') DIR = 0;
						else if (FIELD[i][j] == '<') DIR = 2;
						else if (FIELD[i][j] == 'v') DIR = 1;
					}

			//System.out.println("전차 시작 : x = " + x + ", " + y);
			//print1();
			//System.out.println("==============================");
			
			// 하나씩 움직이기
			int tryCnt = 0;
			while (tryCnt < N) {
				//print1();
				//System.out.println("==============================");
				char move = MOVE[tryCnt];

				if (move == 'S') { // 포탄 발사
					int updataX = DELTA[DIR][0];
					int updataY = DELTA[DIR][1];
					int add = 1;
					while (true) {
						if (x + add * updataX >= 0 && x + add * updataX < H && y + add * updataY >= 0
								&& y + add * updataY < W) {
							//System.out.println("(" + (x + add * updataX) + ", " + (y + add * updataY) + ") ");
							if (FIELD[x + add * updataX][y + add * updataY] == '*') {
								FIELD[x + add * updataX][y + add * updataY] = '.';
								break;
							}else if (FIELD[x + add * updataX][y + add * updataY] == '#') 
								break;
							add++;
						} else
							break;
					}
				} else {
					// 방향 업데이트
					if (move == 'U') { DIR = 0; FIELD[x][y] = '^'; } 
					else if (move == 'D') { DIR = 1; FIELD[x][y] = 'v';
					} else if (move == 'L') {
						DIR = 2;
						FIELD[x][y] = '<';
					} else if (move == 'R') {
						DIR = 3;
						FIELD[x][y] = '>';
					}

					int updataX = DELTA[DIR][0];
					int updataY = DELTA[DIR][1];
					if (x + updataX >= 0 && x + updataX < H && y + updataY >= 0 && y + updataY < W
							&& FIELD[x + updataX][y + updataY] == '.') {
						char temp = FIELD[x][y];
						FIELD[x][y] = FIELD[x + updataX][y + updataY];
						FIELD[x + updataX][y + updataY] = temp;

						x += updataX;
						y += updataY;
					}

				}
				tryCnt++;
				//print1();
				//System.out.println("==============================");
			}

			//print1();
			//break;
			System.out.print("#"+oneCase+" ");
			print();
		}

		sc.close();
	}

	private static void print() {
		for (int i = 0; i < H; i++) {
			for (int j = 0; j < W; j++)
				System.out.print(FIELD[i][j]);
			System.out.println();
		}
	}
/*
	private static void print1() {
		for (int i = 0; i < H; i++)
			System.out.println(Arrays.toString(FIELD[i]));
	}
	*/
}
