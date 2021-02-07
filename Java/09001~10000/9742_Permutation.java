package com.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Permutation_9742 {
	static char[] DATA;
	static char[] TERGET;
	static boolean[] isSelected;
	static int COUNT, NUMBER, N;
	static StringBuilder sb;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//for (int oneCase = 1; oneCase <= 5; oneCase++) {
		while(true) {
			
			String input = br.readLine();
			if(input==null)break;
			StringTokenizer st = new StringTokenizer(input, " ");

			String content = st.nextToken();
			DATA = content.toCharArray();
			COUNT = 0;
			NUMBER = Integer.parseInt(st.nextToken());
			N = DATA.length;
			isSelected = new boolean[N];
			TERGET = new char[N];

			System.out.print(content + " " + NUMBER + " = ");
			perm(0);
			//System.out.println(COUNT);
			if(COUNT < NUMBER)
				System.out.println("No permutation");
		}

	}

	public static void perm(int tgtIdx) {

		if (tgtIdx == N) {
			if (COUNT + 1 == NUMBER) {
				for (int i = 0; i < N; i++)
					System.out.print(TERGET[i]);
				System.out.println();
			}
			COUNT++;
			return;
		}

		for (int i = 0; i < N; i++) {
			if (isSelected[i])
				continue;

			TERGET[tgtIdx] = DATA[i];
			isSelected[i] = true;
			perm(tgtIdx + 1);
			isSelected[i] = false;
		}
	}
}
