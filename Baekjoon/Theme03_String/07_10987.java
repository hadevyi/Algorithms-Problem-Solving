import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 모음의 개수
 *  - 번호 : 10987
 *  - 링크 : https://www.acmicpc.net/problem/10987
 *  2. 풀이핵심
 *  - Count Array를 활용한 문자열 출력
 * 3. 풀이후기
 *  - aeiou의 index를 합친 결과를 출력함
 */
public class Main {

    static int N = 26;
    static int[] charArr;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int Len = str.length();
        charArr = new int[N];

        for (int i = 0;i < Len;i++)
            charArr[str.charAt(i) - 'a']++;

        System.out.println(charArr[0] + charArr[4] + charArr[8] + charArr[14] + charArr[20]);
    }
}