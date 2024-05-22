import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : A+B
 *  - 번호 : 1000
 *  - 링크 : https://www.acmicpc.net/problem/1000
 * 2. 풀이핵심
 *  - 입력에 대한 산수 계산 출력
 * 3. 풀이후기
 *  - 오랜만의 StringTokenizer로 thorws 처리에 오래걸렸던 것이 신선한 충격이였다.
 *  - 불필요한 변수를 줄이면서 깔끔하게 진행해보는 것을 고민해보기 시작한다.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        System.out.println(Integer.parseInt(st.nextToken())+Integer.parseInt(st.nextToken()));
    }
}