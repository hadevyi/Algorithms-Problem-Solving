package homework;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
//import java.util.Arrays;
import java.util.StringTokenizer;

public class SpotMart_9229 {
	static int T, N, M, R=2, MAX; // 총 테케 수, 데이터의 수, 뽑고자하는 수, 현재 MAX
	static int[] Snacks, Check; // 과자 정보 배열, 조합 저장 배열

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("SpotMart_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			String input = br.readLine();
			StringTokenizer st = new StringTokenizer(input, " ");

			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			MAX = -1; // 기본값 세팅 (따라서 찾지 못하면 -1을 줄것임)

			Snacks = new int[N];
			Check = new int[R];

			input = br.readLine();
			st = new StringTokenizer(input, " ");
			for (int i = 0; i < N; i++)
				Snacks[i] = Integer.parseInt(st.nextToken());
			
			//System.out.println(Arrays.toString(Snacks));
			combination(0, 0); // 조합확인
			System.out.println("#" + oneCase + " " + MAX);
		}
	}

	public static void combination(int idx, int cnt) {
		if (cnt == R) { // 2개가 모두 채워지면
			//System.out.println(Arrays.toString(Check));
			int sum = Check[0] + Check[1];
			if (sum <= M) // M 이하일때 갱신 확인
				MAX = MAX < sum ? sum : MAX;
			return;
		}

		for (int i = idx; i < N; i++) {
			Check[cnt] = Snacks[i];
			combination(i + 1, cnt + 1);
		}

	}

}
