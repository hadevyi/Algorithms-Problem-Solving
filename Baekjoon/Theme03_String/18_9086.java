import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 9086
 *  - 번호 : 문자열
 *  - 링크 : https://www.acmicpc.net/problem/9086
 *  2. 풀이핵심
 *  - 문자열 자유롭게 확인하기
 * 3. 풀이후기
 *  - 전체의 길이를 확인하면 쉽게 풀이할 수 있는 문제였음.
 */
public class Main {
    static int T;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++) {
            String str = br.readLine();
            int len = str.length();

            sb.append(str.charAt(0)).append(str.charAt(len - 1)).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
