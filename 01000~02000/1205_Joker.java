package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Joker_1205 {
	static int N, cntZero, MAX;
	static List<Integer> list = new ArrayList<Integer>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Joker_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		// 초기화
		N = Integer.parseInt(br.readLine());

		// 입력값 세팅
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < N; i++) {
			int num = Integer.parseInt(st.nextToken());

			if (num == 0) // 현재값이 0이면 조커의 갯수를 센다.
				cntZero++;
			else if (!isExist(list, num)) // list에 존재 하지 않으면 추가한다.
				list.add(num);
		}
		MAX = cntZero;
		Collections.sort(list); // 오름차순으로 정렬한다.

		for (int i = 0; i < list.size(); i++) // 시작하고자 하는 위치를 계속 바꿔본다.
			MAX = Math.max(StraightLen(i, cntZero), MAX); // 방금 구한 스트레이트 길이가 더 큰 값으로 갱신

		System.out.println(MAX);
	}

	private static int StraightLen(int startIdx, int JokerNum) {
		int len = 1; // 최소 카드 수 : 하나
		
		for (int i = startIdx + 1; i < list.size(); i++) { // 시작위치 + 1부터 끝까지 확인
			if (list.get(i) - 1 == list.get(i - 1)) // 앞에 값보다 1 크면 (순차대로면)
				len++;								// 하나 증가한다.
			else if (list.get(i) - list.get(i - 1) - 1 <= JokerNum) {
				// 사이에 필요한 개수가 Joker의 개수보다 작거나 같을때
				JokerNum -= list.get(i) - list.get(i - 1) - 1; // Joker는 필요한 개수만큼 사용
				len += list.get(i) - list.get(i - 1); // 총 길이는 사용한 개수 + 1(바로 다음 수)
			} else // 어디에도 포함되지 않는다면
				break; // 검사 종료
		}

		if (JokerNum > 0) // Joker 카드가 남아있다면
			len += JokerNum; // 모두 길이에 붙여주기

		return len;
	}

	private static boolean isExist(List<Integer> intList, int value) {
		// intList에서 해당 value가 있으면 true를 return함
		for (int i = 0; i < intList.size(); i++) {
			if (intList.get(i) == value)
				return true;
		}
		return false;
	}
}
