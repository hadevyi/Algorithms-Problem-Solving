package com.swexpertacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

/*
 * 핵심
 * - 방은 상하좌우로만 이동할 수 있다.
 * - 현재 방과 다음 방의 차이는 정확히 1
 * - 다음 방이 현재 방보다 커야함
 */

public class RoomMove_1861 {
// global 선언 : 케이스의 총 갯수 T, Room 2D Array의 N, MaxMoveCnt, MaxMoveValue, 4방탐색 DELTA
	static int T, N; // 총 케이스 수, NxN의 수
	static int[][] Room, DELTA = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };// Room정보와 4방탐색(상하좌우) 델타
	static int MaxMoveCnt, MaxMoveValue;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/RoomMove_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = Integer.parseInt(br.readLine()); // 현재 N각형 입력
			Room = new int[N][N]; // Room 초기화
			MaxMoveCnt = 0;
			MaxMoveValue = 0;

			// 데이터 입력
			for (int i = 0; i < N; i++) {
				String data = br.readLine();
				StringTokenizer st = new StringTokenizer(data, " ");

				for (int j = 0; j < N; j++) {
					Room[i][j] = Integer.parseInt(st.nextToken());
				}
			}

			// 찾기
			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					search(i, j, Room[i][j], 1);
				}
			}

			// print();
			System.out.println("#" + oneCase + " " + MaxMoveValue + " " + MaxMoveCnt);
		}
	}

	public static void search(int i, int j, int start, int length) {
		if (MaxMoveCnt < length) {
			MaxMoveCnt = length;
			MaxMoveValue = start;
		} else if (MaxMoveCnt == length) {
			MaxMoveValue = MaxMoveValue > start ? start : MaxMoveValue;
		}
		for (int tryCnt = 0; tryCnt < 4; tryCnt++) {
			int ni = i + DELTA[tryCnt][0];
			int nj = j + DELTA[tryCnt][1];

			if (ni < 0 || ni >= N || nj < 0 || nj >= N || Room[i][j] + 1 != Room[ni][nj])
				continue;

			search(ni, nj, start, length + 1);
		}

	}

	//public static void print() {
	//	for (int i = 0; i < N; i++)
	//		System.out.println(Arrays.toString(Room[i]));
	//}
}
