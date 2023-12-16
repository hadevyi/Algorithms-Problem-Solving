import java.io.*;
import java.util.*;
/**
 * 1. 문제정보
 *  - 제목 : 3 또는 5의 배수
 *  - 링크 : https://www.codetree.ai/missions/4/problems/multiples-of-3-or-5/description
 * 2. 풀이핵심
 *  - 
 * 3. 풀이후기
 *  - 
 */
public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());

        System.out.println(a % 3 == 0 ? "YES" : "NO");
        System.out.println(a % 5 == 0 ? "YES" : "NO");
    }
}