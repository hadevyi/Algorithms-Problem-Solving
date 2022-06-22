import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. 문제정보
 *  - 제목 : 그대로 출력하기
 *  - 번호 : 11718
 *  - 링크 : https://www.acmicpc.net/problem/11718
 * 2. 풀이핵심
 *  - 입력과 출력
 * 3. 풀이후기
 *  - BufferedReader readLine 함수의 특징인 null 값을 이용한 내용이였음
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