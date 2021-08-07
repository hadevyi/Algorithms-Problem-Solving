import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {

	static int MAX, N;
	static List<Integer> MAX_arr = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		for (int n = N; n > 0; n--) {
			List<Integer> list = new ArrayList<Integer>();
			list.add(N);
			list.add(n);

			int idx = 1;
			while (true) {
				int now = list.get(idx-1) - list.get(idx);

				if (now < 0)
					break;

				list.add(now);
				idx++;
			}

			MAX_arr = list.size() > MAX_arr.size() ? list : MAX_arr;
		}

		StringBuffer sb = new StringBuffer();
		sb.append(MAX_arr.size()).append("\n");
		for (int i = 0; i < MAX_arr.size(); i++) {
			sb.append(MAX_arr.get(i));
			if (i < MAX_arr.size() - 1)
				sb.append(" ");
		}

		System.out.println(sb.toString());
	}
}
