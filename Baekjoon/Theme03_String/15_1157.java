import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어 공부
 *  - 번호 : 1157
 *  - 링크 : https://www.acmicpc.net/problem/1157
 *  2. 풀이핵심
 *  - 각 조건에 알맞는 구현하기
 * 3. 풀이후기
 *  - 전체를 입력받은 후 최대를 구해, 그와 동일한 문자열을 출력했음
 */
public class Main {
    static int N = 26;
    static int[] COUNT;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] charArr = br.readLine().toCharArray();
        StringBuffer sb = new StringBuffer();
        int Len = charArr.length;
        COUNT = new int[N];

        for (int len = 0;len < Len;len++) {
            char ch = charArr[len];

            if ('A' <= ch && ch <= 'Z') ch += 'a' - 'A';

            COUNT[ch - 'a']++;
        }

        int maxLen = 0;
        for (int n = 0;n < N;n++) maxLen = Integer.max(maxLen, COUNT[n]);

        int maxCount = 0;
        char maxChar = ' ';
        for (int n = 0;n < N;n++) {
            if (COUNT[n] == maxLen) {
                maxCount++;
                maxChar = (char)(n + 'A');
            }
        }

        if (maxCount == 1) System.out.println(maxChar);
        else System.out.println("?");
    }
}