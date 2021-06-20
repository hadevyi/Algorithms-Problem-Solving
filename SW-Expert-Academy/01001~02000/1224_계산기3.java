package selfstudy;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;

public class Postfix_1224 {
	static String infix, postfix;
	static int T = 10, N;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("postfix1224_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int oneCase = 1; oneCase <= T; oneCase++) {

			N = Integer.parseInt(br.readLine());
			infix = br.readLine();
			changFix();
			
			System.out.println("#"+oneCase+" "+calculPost());
		}
	}

	public static int calculPost() {
		Stack<Integer> sum = new Stack<Integer>();
		for (int i = 0; i < postfix.length(); i++) {
			char data = postfix.charAt(i);

			if ('0' <= data && data <= '9') {
				sum.push(data - '0');
			} else {
				int num1 = sum.pop();
				int num2 = sum.pop();
				
				switch (data) {
				case '+':
					sum.push(num1 + num2);					
					break;
				case '*':
					sum.push(num1 * num2);					
					break;
				case '-':
					sum.push(num1 - num2);					
					break;
				case '/':
					sum.push(num1 / num2);					
					break;
				}
			}
		}

		return sum.pop();
	}

	public static void changFix() {
		Stack<Character> op = new Stack<Character>();
		char[] data = infix.toCharArray();
		postfix = "";

		for (int i = 0; i < data.length; i++) {
			if ('1' <= data[i] && data[i] <= '9')
				postfix += data[i];
			else {
				switch (data[i]) {
				case '(':
					op.push(data[i]);
					break;
				case '+':
				case '-':
					while (!op.isEmpty() && op.peek() != '(')
						postfix += op.pop();
					op.push(data[i]);
					break;
				case '*':
				case '/':
					while (!op.isEmpty() && (op.peek() == '*' || op.peek() == '/'))
						postfix += op.pop();
					op.push(data[i]);
					break;
				case ')':
					while (!op.isEmpty() && op.peek() != '(')
						postfix += op.pop();
					op.pop();
					break;
				}
			}

		}
		while (!op.isEmpty())
			postfix += op.pop();
	}
}
