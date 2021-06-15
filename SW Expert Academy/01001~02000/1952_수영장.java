package A;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Poll_1952 {
	static int T, MIN;
	static int[] pay; // 순서대로 1일, 1달, 3달, 1년 이용권
	static int[] month;//

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Poll.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			pay = new int[4];
			month = new int[12];

			StringTokenizer st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 4; i++)
				pay[i] = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < 12; i++)
				month[i] = Integer.parseInt(st.nextToken());

			MIN = pay[pay.length - 1]; // 최소는 연이용권 금액

			for (int i = 0; i < 3; i++)
				dfs(0, i, 0); // 순서대로 월,이용권,합

			// System.out.println(Arrays.toString(pay));
			// System.out.println(Arrays.toString(month));
			System.out.println("#" + t + " " + MIN);
		}
	}

	private static void dfs(int idx, int payNum, int sum) {
		if (sum >= MIN) // 현재 합이 MIN보다 커지면 종료 (가지치기)
			return;

		if (idx >= 12) { // 마지막까지 도달하면 검사 후 종료
			MIN = Math.min(MIN, sum);
			return;
		}

		if (payNum == 0) {
			dfs(idx + 1, 0, sum + pay[payNum] * month[idx]);
			dfs(idx + 1, 1, sum + pay[payNum] * month[idx]);
			dfs(idx + 1, 2, sum + pay[payNum] * month[idx]);
		} else if (payNum == 1) {
			dfs(idx + 1, 0, sum + pay[payNum]);
			dfs(idx + 1, 1, sum + pay[payNum]);
			dfs(idx + 1, 2, sum + pay[payNum]);
		} else if (payNum == 2) {
			dfs(idx + 3, 0, sum + pay[payNum]);
			dfs(idx + 3, 1, sum + pay[payNum]);
			dfs(idx + 3, 2, sum + pay[payNum]);
		}

	}
}
