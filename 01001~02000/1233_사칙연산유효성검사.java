package workshop;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Calcul_1233 {
	static int N, T = 10;
	static String[] node;
	static boolean check;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Calcul_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = Integer.parseInt(br.readLine());
			check = true;

			node = new String[N + 1];

			for (int i = 0; i < N; i++) {
				String input = br.readLine();
				StringTokenizer st = new StringTokenizer(input, " ");

				node[Integer.parseInt(st.nextToken())] = st.nextToken();
				if (st.countTokens() > 2)
					node[Integer.parseInt(st.nextToken())] = st.nextToken();

			}

			dfs(1);

			if (check)
				System.out.println("#" + oneCase + " 1");
			else
				System.out.println("#" + oneCase + " 0");
		}
	}

	public static void dfs(int idx) {
		if (idx > N)
			return;

		dfs(idx * 2);
		dfs(idx * 2 + 1);

		if (idx * 2 > N || idx * 2 + 1 > N)
			if (node[idx].equals("+") || node[idx].equals("-") || node[idx].equals("*") || node[idx].equals("/"))
				check = false;
	}
}
