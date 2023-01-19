import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : A-B
 *  - 번호 : 1001
 *  - 링크 : https://www.acmicpc.net/problem/1001
 * 2. 풀이핵심
 *  - 간단한 산수 문제
 * 3. 풀이후기
 *  - 짧게 풀이가능한 문제였음
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st = new StringTokenizer(br.readLine());
        sb.append(Integer.parseInt(st.nextToken()) - Integer.parseInt(st.nextToken()));
        System.out.println(sb.toString());
    }
}
