import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 * 1. 문제정보
 *  - 제목 : 운동장 한 바퀴
 *  - 번호 : 16486
 *  - 링크 : https://www.acmicpc.net/problem/16486
 * 2. 풀이핵심
 *  - 운동장으로 칭해져있는 전체 도형의 둘레 길이 구하기
 *  - 원의 둘레 = 2 * 원의 반지름 * 원주율(3.141592)
 * 3. 풀이후기
 *  - 오랜만의 원의 둘레 공식을 잊은 것을 제외하면 무난한 문제 
 */
public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int d1 = Integer.parseInt(br.readLine()); // 직사각형의 가로 길이
        int d2 = Integer.parseInt(br.readLine()); // 반 원의 반지름의 길이

        double circle = 2 * d2 * 3.141592;

        System.out.println(d1 + d1 + circle);
    }
}