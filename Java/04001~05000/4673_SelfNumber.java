package beakjoon;

public class SelfNumber_4673 {
	public static void main(String[] args) {
		for (int number = 1; number <= 10000; number++) {
			int count = 0, total;

			for (int i = 1; i < number; i++) {
				total = i;
				char[] data = Integer.toString(i).toCharArray();
				for (int j = 0; j < data.length; j++)
					total += data[j] - '0';
				
				if(total==number) {
					count++;
					break;
				}
			}

			if (count == 0)
				System.out.println(number);
		}
	}
}
