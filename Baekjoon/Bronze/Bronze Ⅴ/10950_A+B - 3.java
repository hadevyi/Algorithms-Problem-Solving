import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : A+B - 3
 *  - 번호 : 10950
 *  - 링크 : https://www.acmicpc.net/problem/10950
 * 2. 풀이핵심
 *  - 입력된 T만큼의 동일 로직 반복하기
 * 3. 풀이후기
 *  - 빠른 문자열 출력을 위해 StringBuffer를 이용하며, 불필요한 변수를 최소화함
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++){
            st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
            if(t < T-1) sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
