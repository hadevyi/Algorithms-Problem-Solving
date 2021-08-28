import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		BigInteger num1 = new BigInteger(br.readLine());
		BigInteger num2 = new BigInteger(br.readLine());
		
		System.out.println(num1.add(num2));
		System.out.println(num1.subtract(num2));
		System.out.println(num1.multiply(num2));
	}
}
