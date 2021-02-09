package com.swexpertacademy;

import java.io.FileInputStream;
import java.util.Scanner;
import java.util.Stack;

public class Parentheses_1218 {
	static int T = 10;
	static int N;
	static char[] DATA;
	static Stack<Character> stack = new Stack<>();

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Parentheses_input.txt"));
		Scanner sc = new Scanner(System.in);
		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = sc.nextInt();
			DATA = sc.next().toCharArray();

			stack.clear();// 스택 초기화

			// 검사
			for (int i = 0; i < N; i++) {
				char now = DATA[i];

				if (now == '[' || now == '{' || now == '(' || now == '<') {
					// 오픈 괄호이면 push!
					stack.push(now);
				} else {
					// 닫는 괄호이면 stack pop한 결과랑 쌍인지 비교
					if (!stack.isEmpty()) {
						char temp = stack.peek();
						if ((temp == '[' && now == ']') || (temp == '{' && now == '}') || (temp == '(' && now == ')')
								|| (temp == '<' && now == '>')) {
							stack.pop();
						} else
							break;
					} else
						break; // 닫는 괄호가 왔는데 stack이 비었으면 유효하지 않음으로 break
				}
			}

			System.out.println("#" + oneCase + " " + (stack.isEmpty() ? 1 : 0));
		}
		sc.close();
	}

}
