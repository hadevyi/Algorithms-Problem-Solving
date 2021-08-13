import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		String t = br.readLine();
		int sN = s.length(), tN = t.length();
		StringBuffer sb = new StringBuffer();

		if (sN == tN) {
			System.out.println(s.equals(t) ? 1 : 0);
		} else {
			String Large = sN < tN ? t : s;
			String Small = sN > tN ? t : s;
			int lLen = Large.length(), sLen = Small.length();

			if (tN % sN == 0) {

				for (int i = 0; i < lLen / sLen; i++) {
					sb.append(Small);
				}

				System.out.println(sb.toString().equals(Large) ? 1 : 0);
			} else {
				StringBuffer fL = new StringBuffer();
				StringBuffer fS = new StringBuffer();

				for (int i = 0; i < lLen; i++)
					fS.append(Small);

				for (int i = 0; i < sLen; i++)
					fL.append(Large);

				System.out.println(fL.toString().equals(fS.toString()) ? 1 : 0);
			}
		}
	}
}