package homework;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Tower_2493 {
	static Stack<Data> Tower = new Stack<Data>(); // Data 객체를 받는 스택
	static int N; // 총 갯수

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		String input = in.readLine();
		StringTokenizer st = new StringTokenizer(input, " ");
		StringBuilder str = new StringBuilder(""); // String + 대신 사용하기 위한 StringBuiler(For Memory Over)

		for (int i = 1; i <= N; i++) {
			int now = Integer.parseInt(st.nextToken()); // 현재의 수

			while (!Tower.isEmpty()) { // 안에가 비어있지 않다면
				if (Tower.peek().hieght >= now) { // 최상위의 높이가 현재값보다 크면
					str.append(Tower.peek().index + " "); // 최상위 Tower의 index를 출력
					break; // 그 이후는 확인하지 않음
				}
				Tower.pop(); // 최상위의 높이가 현재보다 작으면 stack에서 삭제
			}

			if (Tower.isEmpty()) // 비어있다면,
				str.append("0 "); // 0 출력 고정
			Tower.push(new Data(now, i)); // 현재의 내용은 스택에 추가
		}

		System.out.println(str);

	}

	static class Data {
		int hieght; // 높이
		int index; // 순서(index)

		Data(int hieght, int index) {
			this.hieght = hieght;
			this.index = index;
		}
	}
}
/*
 * 5 6 9 5 7 4
 */