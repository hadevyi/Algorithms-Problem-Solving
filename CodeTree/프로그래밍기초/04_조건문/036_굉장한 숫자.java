import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 굉장한 숫자
 *  - 링크 : https://www.codetree.ai/missions/4/problems/amazing-number/description
 * 2. 풀이핵심
 *  - 복합 연산자 활용
 * 3. 풀이후기
 *  - 간단한 문제 풀이
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        System.out.println(((n % 2 != 0 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) ? "true" : "false");
    }
}