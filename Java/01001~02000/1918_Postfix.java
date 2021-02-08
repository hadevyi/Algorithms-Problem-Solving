package beakjoon;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix_1918 {
	static Stack<Character> stack = new Stack<Character>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String result = "";
		char[] data = br.readLine().toCharArray();

		for (int i = 0; i < data.length; i++) {
			if ('A' <= data[i] && data[i] <= 'Z')
				result += data[i];
			else {
				switch (data[i]) {
				case '(':
					stack.push(data[i]);
					break;
				case '+':
				case '-':
					while (!stack.isEmpty() && stack.peek() != '(')
						result += stack.pop();
					stack.push(data[i]);
					break;
				case '*':
				case '/':
					while (!stack.isEmpty() && (stack.peek() == '*' || stack.peek() == '/'))
						result += stack.pop();
					stack.push(data[i]);
					break;
				case ')':
					while (!stack.isEmpty() && stack.peek() != '(')
						result += stack.pop();
					stack.pop();
					break;
				}
			}
			
		}
		while (!stack.isEmpty())
			result += stack.pop();

		System.out.println(result);
	}
}
