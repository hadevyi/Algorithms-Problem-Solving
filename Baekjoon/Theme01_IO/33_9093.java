import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어 뒤집기
 *  - 번호 : 9093
 *  - 링크 : https://www.acmicpc.net/problem/9093
 * 2. 풀이핵심
 *  - 문자열 조작하기
 * 3. 풀이후기
 *  - StringTokenizer와 charAt을 활용해 단계별로 조작할 수 있는 간단한 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        for (int l = 0;l < line;l++) {
            st = new StringTokenizer(br.readLine());
            int N = st.countTokens();

            for (int n = 0;n < N;n++) {
                String str = st.nextToken();
                int LEN = str.length();

                for (int len = LEN - 1;len >= 0;len--) sb.append(str.charAt(len));
                if (n < N - 1) sb.append(" ");
            }

            if(l < line - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}