package exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PointSorting_11650 {

	static int N;
	static PriorityQueue<Point> pq = new PriorityQueue<Point>((e1, e2) -> {
		if (e1.x == e2.x)
			return e1.y - e2.y;
		return e1.x - e2.x;
	});

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			pq.add(new Point(x,y));
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}

	static class Point {
		public int x;
		public int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

		@Override
		public String toString() {
			return x + " " + y;
		}
	}

}
