package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RcCar_1940 {
	static int T, N, RESULT;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/RCCar_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			int nowSpeed = 0, result = 0;
			int N = Integer.parseInt(br.readLine());

			for (int i = 0; i < N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				switch (Integer.parseInt(st.nextToken())) {
				case 0:
					break;
				case 1:
					nowSpeed += Integer.parseInt(st.nextToken());
					break;
				case 2:
					nowSpeed -= Integer.parseInt(st.nextToken());
					break;
				}
				
				if (nowSpeed < 0)
					nowSpeed = 0;
				
				result += nowSpeed;
			}
			System.out.println("#" + oneCase + " " + result);
		}
	}
}
