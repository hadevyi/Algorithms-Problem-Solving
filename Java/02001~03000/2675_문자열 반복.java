package beakjoon;

import java.util.Scanner;

public class RepeatChar_2675 {
	static int T;
		
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		T = sc.nextInt();
		
		for (int oneCase = 1;oneCase<=T;oneCase++) {
			int repeat = sc.nextInt();
			char[] str = sc.next().toCharArray();
			String temp = "";
			
			for(int i=0;i<str.length;i++) 
				for(int j=0;j<repeat;j++)
					temp+= str[i];
			
			System.out.println(temp);
		}
		
		sc.close();
	}
}
