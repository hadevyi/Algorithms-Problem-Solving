import java.io.*;

/**
 * 1. 문제정보
 *  - 제목 : 문자열 분석
 *  - 번호 : 10820
 *  - 링크 : https://www.acmicpc.net/problem/10820
 * 2. 풀이핵심
 *  - String의 내용을 분석
 * 3. 풀이후기
 *  - String의 charAt을 잘 활용하면 되었음.
 *  - 표기를 위해 변수를 많이 활용했지만, 더 기준이 다양해지면 배열 등으로도 충분할듯
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str;

        while ((str = br.readLine()) != null) {
            int LEN = str.length();
            int alpha = 0, ALPHA = 0, number = 0, space = 0;

            for (int len = 0;len < LEN;len++) {
                char ch = str.charAt(len);

                if ('a' <= ch && ch <= 'z') alpha++;
                else if ('A' <= ch && ch <= 'Z') ALPHA++;
                else if ('0' <= ch && ch <= '9') number++;
                else space++;
            }
            sb.append(alpha).append(" ").append(ALPHA).append(" ").append(number).append(" ").append(space).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}