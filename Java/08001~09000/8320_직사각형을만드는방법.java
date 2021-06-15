import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	static int N;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());

		int cnt = 0;
		for (int w = 1; w <= N; w++)
			for (int h = w; h <= N; h++)
				if (w * h <= N)
					cnt++;

		System.out.println(cnt);

	}
}