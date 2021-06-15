package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

// 아이디어 - 직전과 같은 index(RGB)는 고르지 않음
// 0 - min(1, 2) + 0값
// 1 - min(0, 2) + 1값
// 2 - min(0, 1) + 2값

public class RGBDistance_1149 {

	static int N; // 집의 크기
	static int[][] House; // 집의 정보
	static int[][] memoi; // 직전의 결과를 중첩해서 저장해둘 배열 

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		House = new int[N][3]; // 0 : R / 1 : G / 2 : B
		memoi = new int[N][3];

		// 값 입력
		for (int n = 0; n < N; n++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			House[n][0] = Integer.parseInt(st.nextToken());
			House[n][1] = Integer.parseInt(st.nextToken());
			House[n][2] = Integer.parseInt(st.nextToken());
		}

		// memoi 진행 - 0의 값은 수동 초기화, 이후는 아이디어에 따라 진행
		memoi[0] = House[0];
		for (int n = 1; n < N; n++) {
			memoi[n][0] = Math.min(memoi[n - 1][1], memoi[n - 1][2]) + House[n][0];
			memoi[n][1] = Math.min(memoi[n - 1][0], memoi[n - 1][2]) + House[n][1];
			memoi[n][2] = Math.min(memoi[n - 1][0], memoi[n - 1][1]) + House[n][2];
		}
		
		// 마지막 결과들 중에서 가장 최소 값을 결과로 찾기
		int result = Math.min(memoi[N-1][0], Math.min(memoi[N-1][1], memoi[N-1][2]));
		System.out.println(result);
	}
}
