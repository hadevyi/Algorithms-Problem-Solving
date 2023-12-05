import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 실수와 문자 받아 출력하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/print-number--and-letter/description
 *  2. 풀이핵심
 *  - 반올림 및 소수점 이하 출력
 * 3. 풀이후기
 *  - printf과 println 활용
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        double a = Double.parseDouble(br.readLine());
        double b = Double.parseDouble(br.readLine());
        System.out.println(c);
        System.out.printf("%.2f\n", Math.round(a * 100) / 100.0);
        System.out.printf("%.2f", Math.round(b * 100) / 100.0);
    }
}