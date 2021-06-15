package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SuperMario_2851 {

	static int N = 10, SUM, IDX;
	static int[] score = new int[N];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		SUM = 0;
		IDX = 0;
		boolean flag = false;

		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(br.readLine());
			score[i] = num;

			if (!flag && SUM + num <= 100) {
				SUM += num;
				IDX = i;
			} else
				flag = true;
		}

		if (SUM < 100) {
			int temp = Integer.MAX_VALUE;

			if (IDX + 1 < N)
				temp = SUM + score[IDX + 1];

			if (Math.abs(SUM - 100) == Math.abs(temp - 100))
				SUM = SUM < temp ? temp : SUM;
			else
				SUM = Math.abs(SUM - 100) < Math.abs(temp - 100) ? SUM : temp;
		}

		System.out.println(SUM);
	}
}
