package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class SecertEmail_2999 {

	static int R, C, N;
	static char[][] map;
	static String str;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder("");

		str = br.readLine();
		N = str.length();

		for (int i = 1; i <= N; i++) {
			int r = i;
			int c = N / i;

			if (r * c == N && r <= c && r > R) {
				R = r;
				C = c;
			}
		}

		map = new char[R][C];
		int idx = 0;
		for (int i = 0; i < C; i++)
			for (int j = 0; j < R; j++) 
				map[j][i] = str.charAt(idx++);
			
		for(int i=0;i<R;i++)
			for(int j=0;j<C;j++)
				sb.append(map[i][j]);
		
		System.out.println(sb.toString());
	}

}
