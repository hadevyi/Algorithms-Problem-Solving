import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 등장하지 않는 문자의 합
 *  - 번호 : 3059
 *  - 링크 : https://www.acmicpc.net/problem/3059
 *  2. 풀이핵심
 *  - ASCII 코드 값과 Boolean을 활용하기
 * 3. 풀이후기
 *  - 순서대로 구현하는 내용이라 어렵지는 않았음.
 */
public class Main {
    static int T, N = 26;
    static int[] charCount;
    static int result;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        T = Integer.parseInt(br.readLine());
        for (int t = 0;t < T;t++) {
            charCount = new int[N];
            result = 0;
            char[] charArr = br.readLine().toCharArray();
            int Len = charArr.length;

            for (int len = 0;len < Len;len++)
                charCount[charArr[len] - 'A']++;

            for (int n = 0;n < N;n++)
                if (charCount[n] == 0)
                    result += 'A' + n;

            sb.append(result).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1));
    }
}
