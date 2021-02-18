package workshop;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class ChickenDeilvery_15686 {
	static int N, M, MIN, SIZE;
	static int[] tgt;
	static ArrayList<House> house = new ArrayList<House>();
	static ArrayList<House> chickenHouse = new ArrayList<House>();

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		MIN = Integer.MAX_VALUE;

		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				int now = Integer.parseInt(st.nextToken());

				if (now == 1)
					house.add(new House(i, j));
				else if (now == 2)
					chickenHouse.add(new House(i, j));
			}
		}

		SIZE = chickenHouse.size();
		tgt = new int[SIZE];

		int cnt = 0;
		while (++cnt <= M)
			tgt[SIZE - cnt] = 1;

		do {
			//System.out.println(Arrays.toString(tgt));
			calculDis();
		} while (np());

		System.out.println(MIN);
	}

	public static boolean np() {
		int i = SIZE - 1;
		while (i > 0 && tgt[i - 1] >= tgt[i])
			--i;

		// 더이상 앞자리가 없는 상황 : 현 순열의 상태가 가장 큰 순열(마지막 순열)
		if (i == 0)
			return false;

		int j = SIZE - 1;
		while (tgt[i - 1] >= tgt[j])
			--j;

		swap(i - 1, j);

		int k = SIZE - 1;
		while (i < k) {
			swap(i++, k--);
		}

		return true;
	}

	private static void swap(int i, int j) {
		int temp = tgt[i];
		tgt[i] = tgt[j];
		tgt[j] = temp;
	}

	public static void calculDis() {
		int sum = 0;
		House[] temp = new House[M];
		int cnt = 0;
		// 현재 조합으로 선택된 chickenHouse 추출하기
		for (int i = 0; i < SIZE; i++)
			if (tgt[i] == 1)
				temp[cnt++] = chickenHouse.get(i);
		
		//System.out.println(Arrays.toString(temp));

		for (int i = 0; i < house.size(); i++) {
			int eachDis = Integer.MAX_VALUE;
			for (int j = 0; j < M; j++) {
				int diff = Math.abs(house.get(i).i - temp[j].i) + Math.abs(house.get(i).j - temp[j].j);
				eachDis = Math.min(eachDis, diff);
			}
			sum += eachDis;
		}

		MIN = Math.min(sum, MIN);
	}

	public static class House {
		int i;
		int j;

		public House(int i, int j) {
			super();
			this.i = i;
			this.j = j;
		}

		@Override
		public String toString() {
			return "House [i=" + i + ", j=" + j + "]";
		}
	}
}