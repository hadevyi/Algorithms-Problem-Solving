import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 가장 많은 글자
 *  - 번호 : 1371
 *  - 링크 : https://www.acmicpc.net/problem/1371
 *  2. 풀이핵심
 *  - 입력의 마지막이 정해지지 않은 문자열 값
 * 3. 풀이후기
 *  - 영소문자의 카운팅을 세는데, 빈 칸을 제외하는 방법을 선택함
 */
public class Main {
    static int N = 26;
    static int[] count = new int[N];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str;

        while ((str = br.readLine()) != null) {
            st = new StringTokenizer(str);
            int COUNT = st.countTokens();

            for (int i = 0;i < COUNT;i++) {
                String token = st.nextToken();
                int Len = token.length();

                for (int len = 0;len < Len;len++)
                    count[token.charAt(len) - 'a']++;
            }
        }

        System.out.println(getCountChar(checkMax()));
    }

    public static int checkMax() {
        int MAX = Integer.MIN_VALUE;
        for (int i = 0;i < N;i++)
            MAX = Integer.max(MAX, count[i]);
        return MAX;
    }

    public static String getCountChar(int num) {
        StringBuffer sb = new StringBuffer();
        for (int n = 0;n < N;n++) {
            if (count[n] == num) sb.append((char)('a' + n));
        }
        return sb.toString();
    }
}
