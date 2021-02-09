package com.swexpertacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SecretCode_1225 {
	static int T = 10, N = 8; // 총 테스트 케이스 갯수, 배열의 크기
	static int[] DATA = new int[N]; // 8개의 숫자를 받는 배열

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/SecretCode_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			sb.delete(0, sb.length()); // sb 초기화
			sb.append("#").append(br.readLine()); // 첫 줄을 읽어 세팅
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");

			for (int i = 0; i < N; i++)
				DATA[i] = Integer.parseInt(st.nextToken());

			// System.out.println(Arrays.toString(DATA));

			// DATA 감소하면서 맨뒤로 옮기기
			int downCnt = 1;
			while (true) {
				int tepInt = DATA[0] - downCnt; // 감소시켜 임의의 공간에 저장하기

				for (int i = 0; i < N - 1; i++) // i+1도 <N이여야하기에 범위 조정
					DATA[i] = DATA[i + 1]; // 1인덱스부터 한칸씩 앞으로 당긴다

				DATA[N - 1] = tepInt; // 마지막칸은 임의 공간값으로

				if (DATA[N - 1] <= 0) { // 만약에 마지막 값이 0이하라면
					DATA[N - 1] = 0; // 0으로 바꿔주고
					break; // 종료
				}
				downCnt++; // 감소 숫자 증가

				if (downCnt > 5)	// 1 ~ 5사이클을 위해 범위 확인
					downCnt = 1;
			}

			//System.out.println(Arrays.toString(DATA));
			//break;

			sb.append(" ");
			
			for(int i=0;i<N;i++)
				sb.append(DATA[i]).append(" ");
			System.out.println(sb);
		}
	}
}
