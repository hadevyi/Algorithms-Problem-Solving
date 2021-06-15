package supplement;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Refrigerator_1828 {

	public static class Refrigerator implements Comparable<Refrigerator> {
		public int min;
		public int max;

		public Refrigerator(int min, int max) {
			this.min = min;
			this.max = max;
		}

		@Override
		public String toString() {
			return "Refrigerator [min=" + min + ", max=" + max + "]";
		}

		@Override
		public int compareTo(Refrigerator o) {
			return this.max - o.max;
		}
	}

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Refrigerator[] ref = new Refrigerator[N];

		for (int i = 0; i < N; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int min = Integer.parseInt(st.nextToken());
			int max = Integer.parseInt(st.nextToken());

			ref[i] = new Refrigerator(min, max);
		}

		int count = 0;

		Arrays.sort(ref);
		//for (Refrigerator refrigerator : ref) {
		//	System.out.println(refrigerator);
		//}

		int now = Integer.MIN_VALUE;
		for(int i=0;i<N;i++) {
			if(ref[i].min > now) {
				now = ref[i].max;
				count++;
			}
		}

		System.out.println(count);
	}
}
