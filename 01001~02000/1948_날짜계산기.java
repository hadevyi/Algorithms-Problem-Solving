package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DaysCalcul_1948 {
	static int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 }; // 0 index는 dummy
	static int T;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/DaysInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int SUM = 0;

			StringTokenizer st = new StringTokenizer(br.readLine());

			int startMonth = Integer.parseInt(st.nextToken());
			int startDay = Integer.parseInt(st.nextToken());
			int endMonth = Integer.parseInt(st.nextToken());
			int endDay = Integer.parseInt(st.nextToken());

			for (int mon = startMonth + 1; mon < endMonth; mon++)
				SUM += days[mon];

			if (startMonth == endMonth)
				SUM += endDay - startDay + 1;
			else {
				SUM += days[startMonth] - startDay + 1;
				SUM += endDay;
			}

			System.out.println("#" + t + " " + SUM);
		}
	}
}
