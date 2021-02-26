package IM;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class HayMound_5603 {
	static int T, N;
	static int[] Hays;

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("inputfile/HayMound_input.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		T = Integer.parseInt(br.readLine());

		for (int t = 1; t <= T; t++) {
			int TOTAL = 0;
			N = Integer.parseInt(br.readLine());
			int sum = 0;

			Hays = new int[N];
			for (int n = 0; n < N; n++) {
				Hays[n] = Integer.parseInt(br.readLine());
				sum += Hays[n];
			}

			sum /= N;
			
			for(int i=0;i<N;i++)
				if(Hays[i]>sum)
					TOTAL += Hays[i] - sum;

			System.out.println("#" + t + " " + TOTAL);
		}
	}
}
