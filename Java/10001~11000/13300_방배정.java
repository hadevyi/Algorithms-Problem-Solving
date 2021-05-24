package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RoomAssignment_13300 {
	static int N, MAX, TOTAL;
	static int[][] student;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/RoomAssignment.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		MAX = Integer.parseInt(st.nextToken());
		student = new int[2][6];

		for (int n = 0; n < N; n++) {
			st = new StringTokenizer(br.readLine());
			int gender = Integer.parseInt(st.nextToken());
			int level = Integer.parseInt(st.nextToken()) - 1;

			student[gender][level]++;
		}

		for (int i = 0; i < 2; i++)
			for (int j = 0; j < 6; j++) {
				TOTAL += student[i][j] / MAX;
				if (student[i][j] % MAX != 0)
					TOTAL++;
			}
		
		System.out.println(TOTAL);
	}
}
