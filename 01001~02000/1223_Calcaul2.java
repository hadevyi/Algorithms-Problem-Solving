package homework;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Stack;
/* test case-example : 9 3+4+5*6+7 */

public class Calcaul2_1223 {
	static int N, T = 10;
	static String infix, postfix;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/Calcaul2_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for (int oneCase = 1; oneCase <= T; oneCase++) {
			N = Integer.parseInt(br.readLine());

			infix = br.readLine();
			changeFix();
			//System.out.println(postfix);
			// System.out.println(infix + "\n=>" + postfix + "\n");
			System.out.println("#" + oneCase + " " + postResult());
		}
	}

	public static int postResult() {
		Stack<Integer> sum = new Stack<Integer>();

		for (int i = 0; i < N; i++) {
			char data = postfix.charAt(i);

			if ('0' <= data && data <= '9') {
				sum.push(data - '0');
			} else {
				int num1 = sum.pop();
				int num2 = sum.pop();
				if (data == '+') {
					sum.push(num1 + num2);
				} else if (data == '*') {
					sum.push(num1 * num2);
				}
			}
		}

		return sum.pop();
	}

	public static void changeFix() {
		Stack<Character> op = new Stack<Character>();
		postfix = "";

		for (int i = 0; i < N; i++) {
			char data = infix.charAt(i);
			// System.out.print(data + " ");

			if ('0' <= data && data <= '9') { // 숫자면 push
				postfix += data;
			} else {
				while (!op.isEmpty() && ((op.peek() == '*' && data == '+') || (op.peek() == data))) {
					postfix += op.pop();
				}
				op.push(data);
			}
		}
		while (!op.empty())// 스택에 남아있는 연산자 처리
			postfix += op.pop();
	}
}