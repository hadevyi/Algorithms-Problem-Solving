import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 세 실수의 반올림
 *  - 링크 : https://www.codetree.ai/missions/4/problems/rounding-of-three-actual-numbers/description
 *  2. 풀이핵심
 *  - 반올림을 한 이후에 출력 조절
 * 3. 풀이후기
 *  - 다양한 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        double c = Double.parseDouble(br.readLine());
        System.out.printf("%.3f\n", Math.round(a * 1000) / 1000.0);
        System.out.printf("%.3f\n", Math.round(b * 1000) / 1000.0);
        System.out.printf("%.3f", Math.round(c * 1000) / 1000.0);
    }
}