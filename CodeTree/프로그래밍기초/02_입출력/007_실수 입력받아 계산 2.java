import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 실수 입력받아 계산 2
 *  - 링크 : https://www.codetree.ai/missions/4/problems/calculation-by-inputting-a-real-number-2/description
 *  2. 풀이핵심
 *  - 소수점 자리 표기
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a = Double.parseDouble(br.readLine()) + 1.5;
        System.out.println(Math.round(a * 100) / 100.0);
    }
}