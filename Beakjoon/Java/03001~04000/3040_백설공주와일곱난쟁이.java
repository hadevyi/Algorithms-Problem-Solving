package homework;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class WhitePrincess_3040 {
	static int N = 9, R = 7; // 총 인원(9명), 목표 수(7명)
	static int[] Person, Data; // 모든 정보, 선정한 데이터

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Person = new int[N];
		Data = new int[R];

		for (int i = 0; i < N; i++)
			Person[i] = Integer.parseInt(br.readLine()); // 한 줄 입력이기에 readLine으로 바로 입력

		comb(0, 0); // 0번 인덱스부터 0개의 길이로 시작
	}

	public static void comb(int idx, int cnt) {
		if (cnt == R) {
			check(); // R의 길이를 만족했을 때 100의 합을 만족하는지 확인
			return;
		}

		for (int i = idx; i < N; i++) { // 새로운 인덱스부터 확인하며,
			Data[cnt] = Person[i]; // cnt번째 위치에 넣기
			comb(i + 1, cnt + 1); // 겹치지 않도록 i+1해서 다음으로 넘기기
		}
	}

	public static void check() {
		// 선정된 7개의 합 구하기
		int sum = 0;
		for (int i = 0; i < R; i++)
			sum += Data[i]; 

		// 전체 합이 100을 만족하면 한줄에 하나씩 출력
		if (sum == 100)
			for (int data : Data)
				System.out.println(data);
	}
}
