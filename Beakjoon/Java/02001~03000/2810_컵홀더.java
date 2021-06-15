import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N;
	static char[] data;

	public static void main(String[] args) throws Exception {
		// System.setIn(new FileInputStream("BOJ.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		data = br.readLine().toCharArray();

		int cnt = N + 1, idx = 0;
		while (idx < N) {
			if (idx + 1 < N && data[idx] == 'L' && data[idx + 1] == 'L') {
				cnt--;
				idx += 2;
			} else {
				idx++;
			}
		}

		System.out.println(Math.min(cnt, N));
	}

}