import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	static int N = 3;
	static int[] ball = new int[N];
	static int Result;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		int min = Integer.MAX_VALUE;
		for (int n = 0; n < N; n++) {
			int value = Integer.parseInt(st.nextToken());
			ball[n] = value;
			min = Math.min(min, value);
		}

		Result = min;

		for (int n = 0; n < N; n++)
			ball[n] -= min;

		for (int cnt = 3; cnt > 1; cnt--) {
			for (int n = 0; n < N; n++) {
				Result += ball[n] / cnt;
				ball[n] = ball[n] % cnt;
			}
		}

		if (ball[0] == 1 || ball[1] == 1 || ball[2] == 1)
			Result += 1;

		System.out.println(Result);
	}
}