package supplement;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class KoreanMelonField_2477 {
	static int Num;
	static int[][] data = new int[6][2];

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/KoreanMelonField.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		Num = Integer.parseInt(br.readLine());
		int bigLen1 = Integer.MIN_VALUE, bigLen2 = Integer.MIN_VALUE;

		for (int i = 0; i < 6; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			int dir = Integer.parseInt(st.nextToken()) - 1;
			int len = Integer.parseInt(st.nextToken());

			data[i][0] = dir;
			data[i][1] = len;

			if (dir < 2)
				bigLen1 = Math.max(bigLen1, len);
			else
				bigLen2 = Math.max(bigLen2, len);
		}

		int smallLen1 = 0, smallLen2 = 0;
		for (int i = 0; i < 6; i++) {
			if (data[i % 6][0] == data[(i + 2) % 6][0] && data[(i + 1) % 6][0] == data[(i + 3) % 6][0]) {
				smallLen1 = data[(i + 1) % 6][1];
				smallLen2 = data[(i + 2) % 6][1];
				break;
			}
		}

		int result = bigLen1 * bigLen2 - smallLen1 * smallLen2;
		System.out.println(result * Num);
	}
}
