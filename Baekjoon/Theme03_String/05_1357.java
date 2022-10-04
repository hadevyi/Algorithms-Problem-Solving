import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 뒤집힌 덧셈
 *  - 번호 : 1357
 *  - 링크 : https://www.acmicpc.net/problem/1357
 * 2. 풀이핵심
 *  - 동일한 일을 수행하는 함수 별도로 만들기
 * 3. 풀이후기
 *  - 수를 반전시켜 반환하는 rev 함수를 구현하였음
 */
public class Main {
    public static void main(String[] args) throws Exception {
        System.setIn(new FileInputStream("src/input.txt"));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        System.out.println(rev(rev(Integer.parseInt(st.nextToken())) + rev(Integer.parseInt(st.nextToken()))));
    }

    public static int rev(int number) {
        StringBuffer sb = new StringBuffer();

        String str = Integer.toString(number);
        int LEN = str.length();

        for (int len = LEN - 1;len >= 0;len--)
            sb.append(str.charAt(len));

        return Integer.parseInt(sb.toString());
    }
}