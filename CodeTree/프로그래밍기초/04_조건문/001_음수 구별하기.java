import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 음수 구별하기
 *  - 링크 : https://www.codetree.ai/missions/4/problems/separate-negative-number/description
 * 2. 풀이핵심
 *  - 조건문
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        
        System.out.println(number);

        if (number < 0)
            System.out.println("minus");
    }
}