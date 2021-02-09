package com.swexpertacademy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class HamburgerDiet_5215 {
	static int T, N, L, MAX; // 테케 수, 재료 수, 상한선
	static ArrayList<Material> list = new ArrayList<Material>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Hamber_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {

			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");

			N = Integer.parseInt(st.nextToken());
			L = Integer.parseInt(st.nextToken());

			for (int i = 0; i < N; i++) {
				input = br.readLine();
				st = new StringTokenizer(input, " ");

				int score = Integer.parseInt(st.nextToken());
				int calorie = Integer.parseInt(st.nextToken());
				list.add(new Material(score, calorie));
			}

			check(0, 0, 0, 0);
			System.out.println("#" + oneCase + " " + MAX);
		}
	}

	static public void check(int idx, int cnt, int score, int calorie) {
		if (calorie > L)
			return;
		if (cnt == N)
			return;
		if (score > MAX)
			MAX = score;

		for (int i = idx; i < N; i++)
			check(i + 1, cnt + 1, score + list.get(i).score, calorie + list.get(i).calorie);
	}

	static class Material {
		public int score;
		public int calorie;

		public Material(int score, int calorie) {
			this.score = score;
			this.calorie = calorie;
		}
	}
}
