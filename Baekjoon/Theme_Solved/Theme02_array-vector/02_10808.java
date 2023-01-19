import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 알파벳 개수
 *  - 번호 : 10808
 *  - 링크 : https://www.acmicpc.net/problem/10808
 *  2. 풀이핵심
 *  - char의 유니코드 기반 빈도 확인
 * 3. 풀이후기
 *  - char의 'a'의 유니코드 값 최소를 index 0으로 맞춰 카운팅
 */
public class Main {
    static int N = 26;
    static int[] array;

    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        String str = br.readLine();
        int LEN = str.length();
        array = new int[N];

        for (int len = 0;len < LEN;len++) array[str.charAt(len) - 'a']++;
        for (int data : array) sb.append(data + " ");

        System.out.println(sb.toString());
    }
}