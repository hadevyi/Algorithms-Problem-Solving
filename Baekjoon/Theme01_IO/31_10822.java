import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 더하기
 *  - 번호 : 10822
 *  - 링크 : https://www.acmicpc.net/problem/10822
 * 2. 풀이핵심
 *  - StringTokenizer 내용 확인
 * 3. 풀이후기
 *  - 10821번을 응용한 연산 작업
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ",");
        int N = st.countTokens();
        int result = 0;

        for (int n = 0;n < N;n++) {
            String s = st.nextToken();
            if (!s.equals(",")) result += Integer.parseInt(s);
        }

        System.out.println(result);
    }
}