package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DirectChange_8382 {
	static int T;
	static int si, sj, ei, ej;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/DirectionChange.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int result = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());

			si = Integer.parseInt(st.nextToken());
			sj = Integer.parseInt(st.nextToken());
			ei = Integer.parseInt(st.nextToken());
			ej = Integer.parseInt(st.nextToken());

			int dx = Math.abs(si - ei);
			int dy = Math.abs(sj - ej);
			
			if (dx == dy) {
				result = dx*2;
			} else {
				if (dx > dy) result = 2 * dy;
				else result = 2 * dx;
				
				int ddxy = Math.abs(dx - dy);
				if (ddxy % 2 == 0) result += ddxy * 2;
				else result += ddxy * 2 - 1;
			}

			System.out.println("#" + t + " " + result);
		}
	}
}
