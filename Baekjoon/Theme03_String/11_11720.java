import java.io.*;
/**
 * 1. 문제정보
 *  - 제목 : 숫자의 합
 *  - 번호 : 11720
 *  - 링크 : https://www.acmicpc.net/problem/11720
 * 2. 풀이핵심
 *  - char 배열을 기준으로 형 변환으로 합산하기
 * 3. 풀이후기
 *  - 각각의 입력값이 어디 필요한지 확인
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;

        for (int n = 0;n < N;n++)
            result += str.charAt(n) - '0';

        System.out.println(result);
    }
}