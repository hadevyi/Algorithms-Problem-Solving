import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 단어 길이 재기
 *  - 번호 : 2743
 *  - 링크 : https://www.acmicpc.net/problem/2743
 * 2. 풀이핵심
 *  - 문자열 길이 확인
 * 3. 풀이후기
 *  - 기초 문제
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        System.out.println(str.length());
    }
}