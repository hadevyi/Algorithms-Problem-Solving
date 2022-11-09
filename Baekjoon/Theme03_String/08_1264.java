import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 모음의 개수
 *  - 번호 : 1264
 *  - 링크 : https://www.acmicpc.net/problem/1264
 *  2. 풀이핵심
 *  - Count Array를 활용한 문자열 출력
 * 3. 풀이후기
 *  - aeiou의 index를 합친 결과를 출력함
 *  - 끝날 때까지 반복되는 출력을 진행함
 */
public class Main {

    static int N = 26;
    static int[] charArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();

        while (true) {
            String str = br.readLine().toLowerCase();

            if (str.equals("#")) break;

            int Len = str.length();
            charArr = new int[N];

            for (int i = 0; i < Len; i++) {
                char ch = str.charAt(i);
                if ('a' > ch || 'z' < ch) continue;
                charArr[ch - 'a']++;
            }

            sb.append(charArr[0] + charArr[4] + charArr[8] + charArr[14] + charArr[20]).append("\n");
        }

        System.out.println(sb.deleteCharAt(sb.length() - 1).toString());
    }
}