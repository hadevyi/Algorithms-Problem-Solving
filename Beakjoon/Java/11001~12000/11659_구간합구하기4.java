import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {

	static int N, M;
	static int[] arr;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		arr = new int[N + 1];

		st = new StringTokenizer(br.readLine());
		int num = 0;
		for (int i = 1; i < N + 1; i++) {
			num += Integer.parseInt(st.nextToken());
			arr[i] = num;
		}

		for (int n = 0; n < M; n++) {
			st = new StringTokenizer(br.readLine());
			int i = Integer.parseInt(st.nextToken());
			int j = Integer.parseInt(st.nextToken());
			System.out.println(arr[j] - arr[i - 1]);
		}
	}
}
