import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 윤년인가
 *  - 링크 : https://www.codetree.ai/missions/4/problems/is-leap-year/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int year = Integer.parseInt(br.readLine());

        String result = "false";
        if (year % 4 == 0 && year % 100 == 0 && year % 400 == 0) result = "true";
        else if (year % 4 == 0 && year % 100 == 0) result = "false";
        else if (year % 4 == 0) result = "true";

        System.out.println(result);
    }
}