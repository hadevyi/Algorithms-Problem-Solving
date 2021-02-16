package com.beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Josephus_1158 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		int cnt = 0, death = 0;

		int[] DATA = new int[N];
		int[] DEATH = new int[N];

		for (int i = 0; i < N; i++)
			DATA[i] = i + 1;

		int idx = 0;
		while (cnt < N) {
			if (DATA[idx] != -1) {
				death++;
				if (death == K) {
					DEATH[cnt++] = DATA[idx];
					DATA[idx] = -1;
					death = 0;
				}
			}

			idx++;
			if (idx >= N)
				idx = 0;
		}

		StringBuilder sb = new StringBuilder("");
		sb.append("<");
		for (int i = 0; i < N; i++) {
			sb.append(DEATH[i]);
			if(i<N-1)
				sb.append(", ");
		}
		sb.append(">");
		System.out.println(sb);
	}
}
