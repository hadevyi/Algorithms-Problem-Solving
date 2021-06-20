package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Millionaire_1859 {
	static int T, N, NUM;
	static int[] data;
	static long TOTAL;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Millionaire_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			// 초기화
			TOTAL = 0;
			N = Integer.parseInt(br.readLine());
			data = new int[N];

			// 값 세팅
			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < N; i++)
				data[i] = Integer.parseInt(st.nextToken());

			// 내용 확인 - 계산
			NUM = data[N - 1]; // 첫 기준값 세팅
			for (int i = N - 2; i >= 0; i--) { // 역순 확인
				if (data[i] < NUM)
					TOTAL += NUM - data[i];
				else // 기준값 변화 (새 오름차순의 정점
					NUM = data[i];
			}

			// 결과 출력
			System.out.println("#" + t + " " + TOTAL);
		}
	}
}
