import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : A+B - 5
 *  - 번호 : 10952
 *  - 링크 : https://www.acmicpc.net/problem/10952
 * 2. 풀이핵심
 *  - 언제 마칠지 모르는 조건의 덧셈
 *  - 조건에 맞춰 구현하기
 * 3. 풀이후기
 *  - 기초 구현과 조건, 사칙연산이여서 무난했음
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;
        int n1, n2;

        while (true) {
            st = new StringTokenizer(br.readLine());
            n1 = Integer.parseInt(st.nextToken());
            n2 = Integer.parseInt(st.nextToken());

            if (n1 == 0 && n2 == 0) break;

            sb.append(n1+n2).append("\n");
        }

        System.out.println(sb.toString());
    }
}