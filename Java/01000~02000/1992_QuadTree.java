package homework;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Arrays;

public class QuadTree_1992 {
	static int[][] map;
	static int N;
	static StringBuilder sb = new StringBuilder("");

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		map = new int[N][N];

		for (int i = 0; i < N; i++) {
			String str = br.readLine();

			for (int j = 0; j < N; j++)
				map[i][j] = str.charAt(j) - '0';
			// System.out.println(Arrays.toString(map[i]));
		}
		
		search(0,0,N);
		System.out.println(sb.toString());
	}

	private static void search(int r, int c, int len) {
		boolean check = false;
		int stand = map[r][c];
		for (int i = r; i < r + len; i++) {
			for (int j = c; j < c + len; j++) {
				if (stand != map[i][j])
					check = true;
			}
		}

		if (!check)
			sb.append(stand);
		else {
			sb.append("(");
			search(r, c, len / 2);
			search(r, c + len / 2, len / 2);
			search(r + len / 2, c, len / 2);
			search(r + len / 2, c + len / 2, len / 2);
			sb.append(")");
		}
	}
}
