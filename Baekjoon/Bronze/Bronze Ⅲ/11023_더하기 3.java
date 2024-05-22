import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : 더하기 3
 *  - 번호 : 11023
 *  - 링크 : https://www.acmicpc.net/problem/11023
 * 2. 풀이핵심
 *  - 한 줄에 수를 받아서 결과를 출력하는 문제
 * 3. 풀이후기
 *  - 한 줄로 받아 전체 숫자의 갯수를 확인하고, 그만큼의 반복문을 돌리는 것이 핵심
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int len = st.countTokens();
        int result = 0;

        for(int i = 0;i < len;i++){
            result += Integer.parseInt(st.nextToken());
        }

        System.out.print(result);
    }
}
