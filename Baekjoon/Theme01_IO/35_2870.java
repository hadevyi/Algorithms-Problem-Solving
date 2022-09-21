import java.math.BigInteger;
import java.util.*;
import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 수학숙제
 *  - 번호 : 2870
 *  - 링크 : https://www.acmicpc.net/problem/2870
 *  2. 풀이핵심
 *  - 문자열에서 숫자 분리하기
 *  - 숫자 정렬하기
 * 3. 풀이후기
 *  - 입력 조건 중 하나가 각 줄에 최대 100글자가 들어올 수도 있다는 것이였다. int(10자리)와 long(20자리)도 훌쩍 넘기에, BigInteger를 사용했다.
 *  - 어느정도의 숫자가 존재할지 모르게 때문에 유동적으로 add할 수 있는 Array List를 활용했다. 이는 Collection으로 sort를 쉽게 했다.
 */
public class Main {
    static int N;
    static ArrayList<BigInteger> arrayList;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        N = Integer.parseInt(br.readLine());
        arrayList = new ArrayList<BigInteger>();

        for (int n = 0;n < N;n++) {
            String str = br.readLine();
            int L = str.length();
            String temp = "";

            for (int l = 0;l < L;l++) {
                char c = str.charAt(l);

                if (c >= '0' && c <= '9') {
                    temp += c;
                } else if (temp.length() > 0) {
                    arrayList.add(new BigInteger(temp));
                    temp = "";
                }
            }

            if (temp.length() > 0) arrayList.add(new BigInteger(temp));
        }

        Collections.sort(arrayList);
        for (int i  = 0;i < arrayList.size();i++) {
            sb.append(arrayList.get(i));
            if (i < arrayList.size() - 1) sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}