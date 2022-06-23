import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. 문제정보
 *  - 제목 : 그대로 출력하기 2
 *  - 번호 : 11719
 *  - 링크 : https://www.acmicpc.net/problem/11719
 * 2. 풀이핵심
 *  - BufferedReader readLine 함수의 특징 확인
 *  - EOF(End of File)을 잘 모를 때의 처리방법
 * 3. 풀이후기
 *  - 11718번과 코드가 유사하다. 전보다는 훨씬 빠르게 풀었고, 난도도 많이 낮아진 느낌이다.
 *  - 공백으로 차이를 주는 것으로 보았을땐 Scanner 등의 입력합수 특징을 고려하도록 만든 문제로 보이지만, BufferedReader로 계속 연습했어서 큰 어려음은 없었다.
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;

        while((str = br.readLine()) != null){
            System.out.println(str);
        }
    }

}
