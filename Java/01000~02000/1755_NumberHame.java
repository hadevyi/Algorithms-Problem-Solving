import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int M, N; // 범위의 값을 나타낼 정수
	// 숫자에 매칭되는 영어 단어들 (0~9 순서대로)
	static String[] alphabet = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
	static PriorityQueue<Data> pq = new PriorityQueue<Data>((e1, e2) -> {
		return e1.reading.compareTo(e2.reading); // 현재의 영어 사전 순서대로 정렬을 함
	}); // Data의 값을 저장해줄 PriorityQueue

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();

		M = Integer.parseInt(st.nextToken()); // 범위의 시작값을 저장
		N = Integer.parseInt(st.nextToken()); // 범위의 끝값을 저장

		for (int i = M; i <= N; i++) // M이상 N이하이므로
			pq.offer(new Data(i)); // pq에 새로운 Object를 추가함

		int cnt = 0; // 몇번째 출력인지 확인할 변수
		while (!pq.isEmpty()) { // pq가 빌때까지 모두 출력함
			Data temp = pq.poll(); // 가장 앞의 Data를 반환
			sb.append(temp.num).append(" "); // 정렬은 reading으로 했지만, 출력은 num으로 진행
			if (++cnt % 10 == 0) // 현재가 10의 배수 출력일 때,
				sb.append("\n"); // 줄바꿈을 표시함
		}
 
		// 결과 출력
		System.out.println(sb.toString());
	}

	static class Data { // 숫자와 영어로 읽는 방식을 저장할 자료형
		private int num; // 숫자
		private String reading; // 숫자를 영어로 읽은 결과

		public Data(int num) { // 숫자만 입력받는 생성자일 때,
			this.num = num; // 현재의 숫자 값은 그대로 this.num으로 저장함.
			this.reading = getEnglish(num); // reading은 각 자리를 확인해야하기 때문에 getEnglish함수 호출
		}

		private String getEnglish(int num) {
			if (num < 10) // num이 10 미만의 숫자일 때, 즉 alphabet 배열의 크기 내의 값이라면,
				return alphabet[num]; // 해당 위치의 값을 반환함

			// 10 이상의 값이라면, N은 99 이하의 숫자이기 때문에 십의 자리 수로 계산함
			int first = num / 10; // 10의 자리수 계산
			int second = num % 10; // 1의 자리수 계산

			return alphabet[first] + " " + alphabet[second]; // 각각을 공백을 함께두어 반환함
		}
	}
}