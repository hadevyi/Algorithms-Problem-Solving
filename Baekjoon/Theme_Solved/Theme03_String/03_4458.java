import java.io.*;

/**
 * 1. 문제정보
 *  - 제목 : 첫 글자를 대문자로
 *  - 번호 : 4458
 *  - 링크 : https://www.acmicpc.net/problem/4458
 * 2. 풀이핵심
 *  - String의 원하는 부분만 변화주기
 * 3. 풀이후기
 *  - 오랜만에 ASCII CODE 변환을 진행하였음
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        int N = Integer.parseInt(br.readLine());

        for (int n = 0;n < N;n++) {
            String str = br.readLine();

            char ch = str.charAt(0);

            if ('a' <= ch && ch <= 'z') sb.append((char)(ch - ('a' - 'A')));
            else sb.append(ch);
            sb.append(str.substring(1, str.length()));

            if (n < N - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}