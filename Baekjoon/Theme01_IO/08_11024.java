import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : 더하기 4
 *  - 번호 : 11024
 *  - 링크 : https://www.acmicpc.net/problem/11024
 * 2. 풀이핵심
 *  - 테스트 케이스만큼 동일한 일 수행하기
 *  - 출력의 메모리도 최소화 할 수 있도록 StringBuffer 이용하기
 * 3. 풀이후기
 *  - String Buffer의 사용방법을 기억해서 더욱 고민해서 빠르게 풀 수 있었던 문제
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int t = 0;t < T;t++){
            st = new StringTokenizer(br.readLine());

            int len = st.countTokens();
            int result = 0;

            for (int l = 0; l < len;l++){
                result += Integer.parseInt(st.nextToken());
            }

            sb.append(result);
            if(t < T - 1){
                sb.append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}