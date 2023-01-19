import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : 빠른 A+B
 *  - 번호 : 15552
 *  - 링크 : https://www.acmicpc.net/problem/15552
 * 2. 풀이핵심
 *  - Java에서 Scanner와 println 대신 스트림을 최소화할 수 있는 방법
 * 3. 풀이후기
 *  - BufferedReader와 StringBuffer를 함께 사용하는 방법을 알면 쉽게 알 수 있는 문제
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++){
            st = new StringTokenizer(br.readLine());

            int n1 = Integer.parseInt(st.nextToken());
            int n2 = Integer.parseInt(st.nextToken());

            sb.append(n1 + n2);

            if(t < T - 1){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}