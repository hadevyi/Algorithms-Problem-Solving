import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : A + B - 7
 *  - 번호 : 11021
 *  - 링크 : https://www.acmicpc.net/problem/11021
 * 2. 풀이핵심
 *  - 조건에 맞춘 구현
 *  - 반복되는 모습 통일
 * 3. 풀이후기
 *  - 이전 10950번 문제에 꾸밈만 있을 뿐 다를 바 없었음
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        for (int t = 0;t < T;t++){
            sb.append("Case #").append(t + 1).append(": ");
            st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            if(t < T - 1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}