package beakjoon;

import java.util.Arrays;
import java.util.Scanner;

public class IntegerNSum_15596 {

	private static long sum(int[] a) {
		int sum = 0;

		for (int i = 0; i < a.length; i++)
			sum += a[i];

		return sum;
	}

	public static void main(String[] args) {
		int[] a;
		int N;
		Scanner sc = new Scanner(System.in);

		N = sc.nextInt();
		a = new int[N];

		for (int i = 0; i < N; i++)
			a[i] = sc.nextInt();

		System.out.println(Arrays.toString(a) + "의 합 : " + sum(a));

		sc.close();
	}
}
