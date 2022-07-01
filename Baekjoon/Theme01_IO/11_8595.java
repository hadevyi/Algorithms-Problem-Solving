import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. 문제정보
 *  - 제목 : 히든 넘버
 *  - 번호 : 8595
 *  - 링크 : https://www.acmicpc.net/problem/8595
 * 2. 풀이핵심
 *  - 연속된 수 문자의 숫자 표기
 *  - 알파벳과 수 구별하기
 * 3. 풀이후기
 *  -
 *  -
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0, num = 0;

        for (int i = 0;i < len;i++) {
            char ch = str.charAt(i);

            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            } else {
                result += num;
                num = 0;
            }
        }

        if (num != 0)
            result += num;

        System.out.println(result);
    }
}
