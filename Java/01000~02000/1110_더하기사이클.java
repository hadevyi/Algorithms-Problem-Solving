package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class addCycle_1110 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());
		int count = 0, temp = num;

		while (true) {
			int num1 = temp / 10;
			int num2 = temp % 10;

			temp = (num2 * 10) + ((num1 + num2) % 10);
			count++;

			if (temp == num)
				break;
		}

		System.out.println(count);
	}

}
