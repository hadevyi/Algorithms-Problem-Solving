import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 출석 부르기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/calling-attendance/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        String result = null;
        switch (number) {
            case 1 : result = "John"; break;
            case 2 : result = "Tom"; break;
            case 3 : result = "Paul"; break;
            default : result = "Vacancy"; break;
        }

        System.out.println(result);
    }
}