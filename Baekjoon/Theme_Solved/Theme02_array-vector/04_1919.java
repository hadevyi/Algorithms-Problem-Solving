import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 애너그램 만들기
 *  - 번호 : 1919
 *  - 링크 : https://www.acmicpc.net/problem/1919
 *  2. 풀이핵심
 *  - 두개의 문자열 순서대로 정리하기
 * 3. 풀이후기
 *  - 각자의 문자열의 부호를 반대로 정해, 최종적으로 남는 데이터의 절대값의 합으로 결과 도출
 */
public class Main {
    static int N = 26;
    static int[] CNT;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String s1 = br.readLine();
        String s2 = br.readLine();
        CNT = new int[N];

        checkChar(s1, 1);
        checkChar(s2, -1);

        System.out.println(getResult());
    }

    public static void checkChar(String str, int data) {
        int LEN = str.length();

        for (int len = 0;len < LEN;len++) {
            CNT[str.charAt(len) - 'a'] += data;
        }
    }

    public static int getResult() {
        int result = 0;

        for(int n = 0;n < N;n++)
            if (CNT[n] != 0) result += Math.abs(CNT[n]);

        return result;
    }
}