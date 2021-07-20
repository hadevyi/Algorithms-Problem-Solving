import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
	static int R, C, N = 9;
	static ArrayList<Data> list = new ArrayList<Data>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		StringTokenizer st = new StringTokenizer(br.readLine());

		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());

		for (int r = 0; r < R; r++) {
			String str = br.readLine();
			int idx = 0;
			int num = 0;

			for (int c = 0; c < C; c++) {
				int now = str.charAt(c) - '0';

				if (now >= 1 && now <= 9) {
					idx = now;
					num = c;
				}
			}

			if (idx >= 1 && idx <= 9)
				list.add(new Data(idx, num));
		}

		Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				return o2.head - o1.head;
			}
		});

		int rank = 1, front = list.get(0).head;
		for (int i = 0; i < N; i++) {
			if (list.get(i).head == front) {
				list.get(i).rank = rank;
			} else {
				list.get(i).rank = ++rank;
				front = list.get(i).head;
			}
		}

		Collections.sort(list, new Comparator<Data>() {
			@Override
			public int compare(Data o1, Data o2) {
				return o1.num - o2.num;
			}
		});

		for (int i = 0; i < N; i++) {
			sb.append(list.get(i).rank);
			if (i < N - 1)
				sb.append("\n");
		}

		System.out.println(sb.toString());
	}

	static class Data {
		public int num;
		public int head;
		public int rank;

		public Data(int num, int head) {
			super();
			this.num = num;
			this.head = head;
			this.rank = 0;
		}
	}
}
