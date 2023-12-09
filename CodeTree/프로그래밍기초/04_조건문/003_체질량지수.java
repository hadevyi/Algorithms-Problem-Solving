import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 체질량지수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/bmi/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        double cm = Double.parseDouble(st.nextToken());
        double kg = Double.parseDouble(st.nextToken());

        double bmi = (kg * 100.0 * 100.0) / (cm * cm);
        System.out.println((int) bmi);

        if (bmi >= 25)
            System.out.println("Obesity");
    }
}