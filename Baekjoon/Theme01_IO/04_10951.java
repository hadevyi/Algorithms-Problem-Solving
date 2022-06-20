import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * 1. 문제정보
 *  - 제목 : A+B - 4
 *  - 번호 : 10951
 *  - 링크 : https://www.acmicpc.net/problem/10951
 * 2. 풀이핵심
 *  - NullPointer 런타임 에러 발생
 *  - EOF(End Of File)을 처리하는 방법
 * 3. 풀이후기
 *  - 문제를 읽어도 언제 끝나는 시점을 알 수 없어 다시 한 번 공부하는 단계가 되었다.
 *  - StringTokenizer를 제외하고도 다양한 방법으로 하는 것을 보았다.
 *  - 참고 : https://st-lab.tistory.com/40
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        String str = "";

        while((str = br.readLine()) != null){
            st = new StringTokenizer(str);
            System.out.println(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
        }
    }
}