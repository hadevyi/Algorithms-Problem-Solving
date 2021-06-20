package homework;
import java.util.Arrays;

public class Snail_1954 {
	//private static int[][] DELTA = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } }; // 4방향 델타(우하좌상)
	private static int[][] A;
	private static int n = 10;

	public static void main(String[] args) {
		A = new int[n][n];

		int K = 0; // 출력할값을 담은 변수
		int N = n; // 각 회전에서 수행할 수행횟수가 지정될 변수(5,4,3,2,1 로 변경됨)
		int SW = 1; // (+1)행과 열의 증가 , (-1)행과 열의 감소
		int I = 0, J = -1;

		while (K <= n * n) {
			for (int P = 1; P <= N; P++) { // 시작은 1~5
				J = J + SW; // 행고정 열변화
				A[I][J] = ++K;
			}
			N = N - 1;

			if (N > 0) {
				for (int P = 1; P <= N; P++) {
					I = I + SW; // 열고정 행변화
					A[I][J] = ++K;
				}
				SW = SW * (-1); // 스위칭
			} else {
				break; // 반복문 빠져나감.
			}
		}
		print();
	}

	private static void print() {
		for (int i = 0; i < n; i++) {
			System.out.println(Arrays.toString(A[i]));
		}
	}
}
