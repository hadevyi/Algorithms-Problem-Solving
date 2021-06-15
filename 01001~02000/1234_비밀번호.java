package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class PassWord_1234 {
	static int T = 10, N;
	static List<Character> list;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/PassWordInput.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int t = 1; t <= T; t++) {
			list = new ArrayList<Character>();
			StringBuilder sb = new StringBuilder();
			sb.append("#").append(t).append(" ");

			StringTokenizer st = new StringTokenizer(br.readLine());
			N = Integer.parseInt(st.nextToken());
			String result = st.nextToken();
			for (int i = 0; i < N; i++)
				list.add(result.charAt(i));

			search();
			for(int i=0;i<list.size();i++)
				sb.append(list.get(i));
			
			System.out.println(sb.toString());
		}
	}

	private static void search() {
		for (int tryCnt = 0; tryCnt < N; tryCnt++) {
			for (int i = 0; i < list.size() - 1; i++) {
				if (list.get(i) == list.get(i + 1)) {
					list.remove(i + 1);
					list.remove(i);
					break;
				}
			}
		}
	}
}
