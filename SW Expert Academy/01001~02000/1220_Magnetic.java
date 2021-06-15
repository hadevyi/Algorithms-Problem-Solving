package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Magnetic_1220 {
	static int T = 10, N;
	static int[][] arr;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/MagneticInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= T; t++) {
			int TOTAL = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N][N];

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for (int j = 0; j < N; j++)
					arr[i][j] = Integer.parseInt(st.nextToken());
			}

			for (int i = 0; i < N; i++) {
				for (int j = 0; j < N; j++) {
					if (arr[i][j] == 1) {// N극 일 때

						for (int mi = i + 1; mi < N; mi++) {
							if (arr[mi][j] == 1) // 같은 N극을 만나면 검사 끝
								break;
							else if (arr[mi][j] == 2) { // S극을 만나면 교착상태 +1
								TOTAL++;
								break;
							}
						}

					}
				}
			}

			System.out.println("#" + t + " " + TOTAL);
		}
	}

}
