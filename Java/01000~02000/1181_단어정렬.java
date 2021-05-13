package exam;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class WorkSorting_1181 {

	static int N;
	static PriorityQueue<String> pq = new PriorityQueue<String>((e1, e2) -> {
		if(e1.length() == e2.length())
			return e1.compareTo(e2);
		return e1.length() - e2.length();
	});

	public static void main(String[] args) throws Exception {
		System.setIn(new FileInputStream("test.txt"));
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		for(int i=0;i<N;i++) {
			String temp = br.readLine();
			
			if(!pq.contains(temp))
				pq.add(temp);
		}
		
		while(!pq.isEmpty()) {
			System.out.println(pq.poll());
		}
	}
}
