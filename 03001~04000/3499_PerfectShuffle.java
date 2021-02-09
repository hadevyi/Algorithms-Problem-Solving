package com.swexpertacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PerfectShuffle_3499 {
	static int T, N;
	static String[] CARD;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/sample_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = Integer.parseInt(br.readLine());
			CARD = new String[N];

			int helfN = N % 2 == 0 ? N / 2 : N / 2 + 1;

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");

			for (int i = 0; i < N; i++)
				CARD[i] = st.nextToken();

			int taget = 1;
			while (taget < N) {
				String temp = CARD[helfN];
				for (int i = helfN; i > taget; i--) {
					CARD[i] = CARD[i - 1];
				}
				CARD[taget] = temp;
				helfN++;
				taget +=2;
			}

			System.out.print("#" + oneCase + " ");
			for (int i = 0; i < N; i++)
				System.out.print(CARD[i] + " ");
			System.out.println();
		}
	}
}
