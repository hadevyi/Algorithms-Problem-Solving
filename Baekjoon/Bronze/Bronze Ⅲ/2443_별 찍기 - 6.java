import java.io.*;

/**
 * 1. 문제정보
 *  - 제목 : 별 찍기 - 6
 *  - 번호 : 2443
 *  - 링크 : https://www.acmicpc.net/problem/2443
 * 2. 풀이핵심
 *  - 별찍기, 반복문, 구현
 * 3. 풀이후기
 *  -
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();

        for (int i = T;i > 0;i--){
            for (int j = 0; j < T - i;j++)
                sb.append(" ");
            for (int j = 0; j < (2 * i) - 1;j++)
                sb.append("*");
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}