import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 실수 입력받아 계산
 *  - 링크 : https://www.codetree.ai/missions/4/problems/calculation-by-inputting-a-real-number/description
 *  2. 풀이핵심
 *  - 입력과 출력
 * 3. 풀이후기
 *  - 기존과 다른 방법으로 출력해보았다. printf가 치트키 수준으로 편하긴하다.
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.printf("%.2f", a + b);
    }
}