package selfstudy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class YVerse_14645 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		for(int i =0;i<N;i++) {
			st = new StringTokenizer(br.readLine());
			K += Integer.parseInt(st.nextToken());
			K -= Integer.parseInt(st.nextToken());
		}
		
		System.out.println("비와이");
	}
}
