import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 일 수 구하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/number-of-days-in-month/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int result = 0;
        if (n == 2) result = 28;
        else if (n == 1 || n == 3 || n == 5 || n == 7 || n == 8 || n == 10 || n == 12) result = 31;
        else result = 30;

        System.out.println(result);
    }
}